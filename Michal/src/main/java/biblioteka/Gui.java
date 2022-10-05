package biblioteka;

import java.util.Scanner;

public class Gui {

    Biblioteka b = new Biblioteka();

    public static void libraryMenu() {
        System.out.println("Co chcesz zrobić");
        System.out.println("1. Wyświetl listę wszystkich książek");
        System.out.println("2. Wyświetl listę czytelników");
        System.out.println("3. Dodaj książkę");
        System.out.println("4. Dodaj czytelnika");
        System.out.println("5. Wypożycz książkę");
        System.out.println("6. Zwróć książkę");
        System.out.println("7. Wyświetl dostępne książki");
        System.out.println("8. W którym roku wydano najwięcej książek");
        System.out.println("9. Najwięcej książek autora");
        System.out.println("10. KONIEC");
    }

    public void initiate(){
        b.initiateBooks();
        b.initiateReaders();
    }
    public void menuChoice(){
        libraryMenu();
        Scanner myScanner = new Scanner(System.in);
        int menuChoice = myScanner.nextInt();

    do {
        switch (menuChoice) {
            case 1:
              b.showBooks();
                menuChoice();
                break;
              case 2:
b.showReaders();
                  menuChoice();
                break;
            case 3:
b.addBook();
                menuChoice();
                break;
            case 4:
b.addReader();
                menuChoice();
                break;
            case 5:
b.rentBook();
                menuChoice();
                break;
            case 6:
b.returnBook();
                menuChoice();
                break;
            case 7:
                b.showAvailableBooks();
                menuChoice();
                break;
            case 8:
                menuChoice();
                break;
            case 9:
                menuChoice();
                break;
            case 10:
                menuChoice();
                break;
        }
    } while (menuChoice == 11);
}

}
