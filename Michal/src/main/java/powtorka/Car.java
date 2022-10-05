package powtorka;

public class Car {
    private String marka;
    private int rocznik;

    public Car(String marka, int rocznik) {
        this.marka = marka;
        this.rocznik = rocznik;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        if (rocznik > 0)
            this.rocznik = rocznik;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", rocznik=" + rocznik +
                '}';
    }
}
