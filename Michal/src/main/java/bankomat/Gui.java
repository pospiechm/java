package bankomat;

import java.util.Scanner;


public class Gui {
    Scanner myScanner = new Scanner(System.in);
    boolean[] isCardValid = new boolean[]{true, true, true};
    int cardNumberPlace;
    int pinTry;

    public void userChoice() {
        System.out.println("1. Wypłata gotówki");
        System.out.println("2. Wpłata gotówki");
        System.out.println("3. Zmień PIN karty");
        System.out.println("4. Koniec");
    }

    public int getUserChoice() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Prosze podac wybor: ");
        return myScanner.nextInt();
    }


}


        /*if(tryCount<2){
        if(userCardPin == cardPins[cardNumberPlace]&& tryCount<2){
                System.out.println("Numer i PIN karty prawidłowe");
         }
            else {
            tryCount += 1;
                System.out.println("Spróbuj ponownie");
                checkPin();
            }
        }
        else {
            System.out.println("karta zablokowana");
        }
        }*/



/*

 */

