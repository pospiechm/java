package Karolina.kompozycja;

import java.util.Objects;

public class Cena {

  public static final int VAT = 23;
  private double wartosc;

  public Cena() {}

  public Cena(double wartosc) {
    this.wartosc = wartosc;
  }

  public double getWartosc() {
    return wartosc;
  }

  public void setWartosc(double wartosc) {
    this.wartosc = wartosc;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cena cena = (Cena) o;
    return Double.compare(cena.wartosc, wartosc) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(wartosc);
  }

  @Override
  public String toString() {
    return "Cena{" +
        "wartosc=" + wartosc +
        '}';
  }
}
