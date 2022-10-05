import java.util.Scanner;

public class Calculator {


    public static void showMenu() {
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. KONIEC");
        System.out.println("Wybierz co chcesz zrobic: ");
    }

    public static void runCalculation(int choice, int num1, int num2) {
        switch (choice) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int choice = 0;

        do {
            showMenu();
            choice = myScanner.nextInt();
            if (choice != 5) {
                System.out.println("Podaj liczbe 1: ");
                int number1 = myScanner.nextInt();

                System.out.println("Podaj liczbe 2: ");
                int number2 = myScanner.nextInt();

                runCalculation(choice, number1, number2);
            }
        } while (choice != 5);
    }
}