package powtorka;

public class KartaDoGry implements Comparable<KartaDoGry> {
    private Figura figura;
    private Kolor kolor;

    public KartaDoGry(Figura figura, Kolor kolor) {
        this.figura = figura;
        this.kolor = kolor;
    }

    public Figura getFigura() {
        return figura;
    }

    public Kolor getKolor() {
        return kolor;
    }

    @Override
    public String toString() {
        return "KartaDoGry{" +
                "figura= " + figura +
                ", kolor= " + kolor +
                '}';
    }

    @Override
    public int compareTo(KartaDoGry karta2) {
        int figura1 = this.figura.getValue();
        int figura2 = karta2.figura.getValue();
        if (figura1 != figura2) {
            return figura1 - figura2;
        }
        int kolor1 = this.kolor.getValue();
        int kolor2 = karta2.kolor.getValue();
        return kolor1 - kolor2;
    }
}
