package Karolina.osoby;

public class Osoba {

  private String nazwisko;
  private int wiek;

  public Osoba(String nazwisko, int wiek) {
    this.nazwisko = nazwisko;
    this.wiek = wiek;
  }

  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public int getWiek() {
    return wiek;
  }

  public void setWiek(int wiek) {
    this.wiek = wiek;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Osoba)) {
      return false;
    }

    Osoba oosba = (Osoba) o;

    if (wiek != oosba.wiek) {
      return false;
    }
    return nazwisko != null ? nazwisko.equals(oosba.nazwisko) : oosba.nazwisko == null;
  }

  @Override
  public int hashCode() {
    int result = nazwisko != null ? nazwisko.hashCode() : 0;
    result = 31 * result + wiek;
    return result;
  }

  @Override
  public String toString() {
    return "Oosba{" +
        "nazwisko='" + nazwisko + '\'' +
        ", wiek=" + wiek +
        '}';
  }
}
