import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Paczkomat {



    public static void menu() {
        System.out.println("1. Odbierz paczkę");
        System.out.println("2. Koniec");
    }


    public static void runPaczkomat(int[] paczki) {
        int userMenuChoice=0;

            menu();
                Scanner scanner = new Scanner(System.in);
        userMenuChoice = scanner.nextInt();
        while (userMenuChoice !=2) {
        System.out.println("Podaj numer paczki");
        int userPackage = scanner.nextInt();
        for (int i = 0; i < paczki.length; i++) {
            if (userPackage == paczki[i]) {
                System.out.println("Odbierz paczkę");
                paczki[i] = 0;
                int codeWasValid = 1;
            } else {

            }
        }
    }

    }
    public static void getPackage() {


    }

    public static void main(String[] args) {
        int[] paczki = {123, 234, 345, 456, 567};
    runPaczkomat(paczki);
    }
}