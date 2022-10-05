package InterfejsyFunkcjonalne.chatManager;

import java.util.List;

public class Database {
    private static final Database connection = new Database();

    private Database() {
    }


    private User loggedIn;
    private List<User> users;

    public void addUser(User toAdd) throws DBException {
        if (users.stream().anyMatch(u -> u.getName().equals(toAdd.getName())))
            throw new DBException("User already exists!");
        users.add(toAdd);
    }

    public static Database getConnection() {
        return connection;
    }

    public User login(User toLogin) throws DBException {
        if (users.stream().anyMatch(u -> u.getName().equals(toLogin.getName())) && users.stream().anyMatch(u -> u.getPassword().equals(toLogin.getPassword()))) {
            for (User u : users) {
                if (u.getName().equals(toLogin.getName()) && u.getPassword().equals(toLogin.getPassword())) {
                    loggedIn = u;

                }
            }
            return loggedIn;
        }
        throw new DBException("User not found!");
    }


    public void logout() {
        loggedIn = null;
    }
}
