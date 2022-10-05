package bankomat;

public class Card {
    private int cardNumber;
    private int cardPin;
    private int cardBalance;
    private boolean isCardValid;

    public int getCardNumber() {
        return cardNumber;
    }

    public int getCardPin() {
        return cardPin;
    }

    public boolean isCardValid() {
        return isCardValid;
    }

    public void setCardPin(int cardPin) {
        this.cardPin = cardPin;
    }

    public void setCardValid(boolean cardValid) {
        isCardValid = cardValid;
    }

    public int getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }


}
