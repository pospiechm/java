package Data220830.Kompozycja;

import java.util.Objects;

public class Cena {

    int wartosc;
    public static final double VAT = 0.23;



    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }


    @Override
    public String toString() {
        return "Cena{" +
                "wartosc=" + wartosc +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cena cena = (Cena) o;
        return wartosc == cena.wartosc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wartosc);
    }
}
