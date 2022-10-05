package Dziedziczenie.zwierzeta;

public class ZwierzeDomowe {
    private int wiek;
    private Plec plec;


    public ZwierzeDomowe (Plec plec) {
        this.wiek = 0;
        this.plec = plec;

    }

    public ZwierzeDomowe(int wiek, Plec plec) {
        this.wiek = wiek;
        this.plec = plec;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public void wydajDzwiek() {
        System.out.println("Dzwiek");
    }

    @Override
    public String toString() {
        return "ZwierzeDomowe{" +
                "wiek=" + wiek +
                ", plec=" + plec +
                '}';
    }
}
