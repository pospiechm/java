package Karolina.sety.osoby;

public class Osoba implements Comparable<Osoba> {

  private String imie;
  private String nazwisko;
  private int wiek;

  public Osoba(String imie, String nazwisko, int wiek) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.wiek = wiek;
  }

  public String getImie() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie = imie;
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

    Osoba osoba = (Osoba) o;

    if (wiek != osoba.wiek) {
      return false;
    }
    if (imie != null ? !imie.equals(osoba.imie) : osoba.imie != null) {
      return false;
    }
    return nazwisko != null ? nazwisko.equals(osoba.nazwisko) : osoba.nazwisko == null;
  }

  @Override
  public int hashCode() {
    int result = imie != null ? imie.hashCode() : 0;
    result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
    result = 31 * result + wiek;
    return result;
  }

  @Override
  public String toString() {
    return "Osoba{" +
        "imie='" + imie + '\'' +
        ", nazwisko='" + nazwisko + '\'' +
        ", wiek=" + wiek +
        '}';
  }

  @Override
  public int compareTo(Osoba o) {
    if (wiek > o.wiek) {
      return 1;
    } else if (wiek < o.wiek) {
      return -1;
    } else {
      return 0;
    }
  }
}
