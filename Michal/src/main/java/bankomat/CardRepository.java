package bankomat;

public class CardRepository {
    private int[] cardNumbers = new int[]{11111, 22222, 33333};
    private int[] cardPins = new int[]{1111, 2222, 3333};
    private boolean[] isCardValid = new boolean[]{true, true, true};

    public CardRepository() {
        this.cardNumbers = cardNumbers;
        this.cardPins = cardPins;
        this.isCardValid = isCardValid;
    }

    public int[] getCardNumbers() {
        return cardNumbers;
    }

    public int[] getCardPins() {
        return cardPins;
    }

    public boolean[] getIsCardValid() {
        return isCardValid;
    }
}


