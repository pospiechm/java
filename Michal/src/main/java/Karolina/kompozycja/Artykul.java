package Karolina.kompozycja;

import java.util.Objects;

public class Artykul {

  private String nazwa;
  private Detale detale;
  private boolean dostepnosc;
  private Cena cena;
  private Lokalizacja lokalizacja;

  public Artykul (String nazwa, Detale detale, boolean dostepnosc, Cena cena, Lokalizacja lokalizacja) {
    this.nazwa = nazwa;
    this.detale = detale;
    this.dostepnosc = dostepnosc;
    this.cena = cena;
    this.lokalizacja = lokalizacja;
  }

  public class Ksiegowa {
    double obliczCene() {
      return cena.getWartosc() + cena.getWartosc() * cena.VAT/100;
    }
  }

  public String getNazwa() {
    return nazwa;
  }

  public Detale getDetale() {
    return detale;
  }

  public boolean isDostepnosc() {
    return dostepnosc;
  }

  public Cena getCena() {
    return cena;
  }

  public Lokalizacja getLokalizacja() {
    return lokalizacja;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public void setDetale(Detale detale) {
    this.detale = detale;
  }

  public void setDostepnosc(boolean dostepnosc) {
    this.dostepnosc = dostepnosc;
  }

  public void setCena(Cena cena) {
    double wartosc = cena.getWartosc();
    if(wartosc>= 1 && wartosc <= 1000) {
      this.cena = cena;
    } else {
      System.out.println("Cena nie mieści się w przedziale");
    }
  }

  public void setLokalizacja(Lokalizacja lokalizacja) {
    this.lokalizacja = lokalizacja;
  }

    public void zmienLokalizacje(double x, double y) {
    lokalizacja.setX(x);
    lokalizacja.setY(y);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Artykul)) {
      return false;
    }
    Artykul artykul = (Artykul) o;
    return dostepnosc == artykul.dostepnosc && nazwa.equals(artykul.nazwa) && detale.equals(artykul.detale) && cena.equals(artykul.cena) && lokalizacja.equals(artykul.lokalizacja);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nazwa, detale, dostepnosc, cena, lokalizacja);
  }

  @Override
  public String toString() {
    return "Artykul{" +
        "nazwa='" + nazwa + '\'' +
        ", detale=" + detale +
        ", dostepnosc=" + dostepnosc +
        ", cena=" + cena +
        ", lokalizacja=" + lokalizacja +
        '}';
  }
}
