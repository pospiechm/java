package powtorka;

public enum Figura {
    WALET(1), DAMA(2), KROL(3), AS(4);
    private int value;

    Figura(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

//    @Override
//    public String toString() {
//        return String.valueOf(value);
//    }
}
