package bankomat;

import java.util.Scanner;

public class AtmOperations {
    // private int[] cardNumbers = new int[]{11111,22222,33333};
    //  private int[] cardPins = new int[]{1111,2222,3333};
    // private boolean[] isCardValid = new boolean[]{true,true,true};

    CardRepository cardRepository = new CardRepository();
    int[] cardNumbers = cardRepository.getCardNumbers();
    int[] cardPins = cardRepository.getCardPins();
    boolean[] isCardValid = cardRepository.getIsCardValid();

    Scanner myScanner = new Scanner(System.in);
    int cardNumberPlace = 100;

    public int cardNumberIdx() {

        System.out.println("Podaj numer karty");
        int userCardNumber = myScanner.nextInt();
        for (int i = 0; i < cardNumbers.length; i++) {
            if (userCardNumber == cardNumbers[i]) {
                // System.out.println("Indeks karty: "+ i);
                cardNumberPlace = i;

                //  System.out.println(cardNumbers[cardNumberPlace]);
            }
        }
        if (userCardNumber == cardNumbers[cardNumberPlace] && isCardValid[cardNumberPlace] == true) {
            System.out.println("Karta prawidłowa");
            checkPin();
        } else {
            System.out.println("Błędna karta lub karta zablokowana");
            cardNumberIdx();
        }
        return cardNumberPlace;

    }

    public boolean checkPin() {
        //System.out.println("Check PIN");
        //System.out.println("numer pinu:" + cardNumberPlace);
        //System.out.println("PIN:" + cardPins[cardNumberPlace]);
        int userCardPin;
        boolean isCardAndPinValid = false;


        for (int j = 0; j < 3; j++) {
            System.out.println("Podaj PIN karty");
            userCardPin = myScanner.nextInt();
            if (userCardPin == cardPins[cardNumberPlace]) {
                System.out.println("Numer i PIN karty prawidłowy");
                isCardAndPinValid = true;
                break;
            } else if ((userCardPin != cardPins[cardNumberPlace]) && j < 2) {
                System.out.println("błędny pin");
            } else {

                System.out.println("Karta została zablokowana");
                isCardValid[cardNumberPlace] = false;
                cardNumberIdx();
            }

        }
        return isCardAndPinValid;

    }
}
