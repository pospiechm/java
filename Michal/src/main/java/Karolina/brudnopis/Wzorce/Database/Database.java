package Karolina.brudnopis.Wzorce.Database;

import java.util.ArrayList;
import java.util.List;

public
class Database {
    private static Database instance = new Database();
    private List<User> users = new ArrayList<>();
    private String loggedIn;

    public List<User> getUsers() {
        return users;
    }

    private Database() {

    }

    public String getLoggedIn() {
        return loggedIn;
    }

    public static Database getInstance() {
        return instance;
    }

    public void logout() {
        loggedIn = null;
        System.out.println("Wylogowano prawidłowo");
    }

    public User login(User toLogin) {//        for (User u : users) {
        // Logowanie z pętlą
//        if (u.getName().equals(toLogin.getName())){
//            if(u.getPassword().equals(toLogin.getPassword())){
//                loggedIn = toLogin.getName();
//                return u;
//            } else {
//                break;
//            }
//        }
//        }
//    return null;

    // logowanie Streamem
        User user = users
                .stream()
                .filter(u -> u.getName().equals(toLogin.getName()) && u.getPassword().equals(toLogin.getPassword()))
                .findFirst()
                .orElse(null);
        loggedIn = user.getName();
        return user;

    }

    public void addUser(User toAdd) {
        if (users.stream()
                .noneMatch(u -> u.getName().equals(toAdd.getName())))
            users.add(toAdd);
    }


    @Override
    public String toString() {
        return "Database{" +
                "users=" + users +
                ", loggedIn='" + loggedIn + '\'' +
                '}';
    }
}
