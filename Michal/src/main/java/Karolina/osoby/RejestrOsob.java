package Karolina.osoby;

import java.util.ArrayList;
import java.util.List;

public class RejestrOsob {

  private List<Osoba> osoby;

  public RejestrOsob() {
    this.osoby = new ArrayList<>();
  }

  public boolean dodajOsobe(Osoba osoba) {
    return osoby.add(osoba);
  }

  public boolean usunOsobe(Osoba osoba) {
    return osoby.remove(osoba);
  }

  public void wypiszListe() {
    if (osoby.isEmpty()) {
      System.out.println("Rejestr nie zawiera żadnych osób");
    }
    for (Osoba osoba : osoby) {
      System.out.println(osoba);
    }
  }

  public Osoba znajdzOsobe(String nazwisko) {
    czyPusta();

    for (Osoba osoba : osoby) {
      if (osoba.getNazwisko().equals(nazwisko)) {
        return osoba;
      }
    }
    System.out.println("Na liście nie ma osoby o nazwisku: " + nazwisko);
    return null;
  }

  public double avg() {
    czyPusta();

    int sumaLat = 0;
    for (Osoba osoba : osoby) {
      sumaLat += osoba.getWiek();
    }
    double srednia = sumaLat / osoby.size();
    System.out.println("Sredni wiek osób na liście to: " + srednia);
    return srednia;
  }

  public Osoba min() {
    czyPusta();

    Osoba min = osoby.get(0);

    for (Osoba osoba : osoby) {
      if (osoba.getWiek() < min.getWiek()) {
        min = osoba;
      }
    }
    return min;
  }

  public Osoba max() {
    czyPusta();

    Osoba max = osoby.get(0);

    for (Osoba osoba : osoby) {
      if (osoba.getWiek() > max.getWiek()) {
        max = osoba;
      }
    }
    return max;
  }

  private void czyPusta() {
    if (osoby.isEmpty()) {
      System.out.println("Rejestr nie zawiera żadnych osób");
    }
  }

  public List<Osoba> getOsoby() {
    return osoby;
  }

  public void setOsoby(List<Osoba> osoby) {
    this.osoby = osoby;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RejestrOsob)) {
      return false;
    }

    RejestrOsob that = (RejestrOsob) o;

    return osoby != null ? osoby.equals(that.osoby) : that.osoby == null;
  }

  @Override
  public int hashCode() {
    return osoby != null ? osoby.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "RejestrOsob{" +
        "osoby=" + osoby +
        '}';
  }
}
