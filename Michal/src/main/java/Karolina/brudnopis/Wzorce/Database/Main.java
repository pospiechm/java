package Karolina.brudnopis.Wzorce.Database;

public class Main {
    public static void main(String[] args) {


        Database db = Database.getInstance();

        User user1 = new User("Michal", "haslo");
        User user2 = new User("Kasia", "Hasło");

        db.addUser(user1);
        db.addUser(user2);

        System.out.println("Użytkownicy w bazie: " + db.getUsers());

        db.login(user2);
        System.out.println("Zalogowany użytkownik: " + db.getLoggedIn().toString());

    }
}
