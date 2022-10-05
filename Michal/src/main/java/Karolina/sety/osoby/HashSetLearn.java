package Karolina.sety.osoby;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetLearn {

  private NavigableSet<Osoba> osoby;

  public HashSetLearn() {
    this.osoby = new TreeSet<>();
  }

  public boolean dodajOsobe(Osoba osoba) {
    return osoby.add(osoba);
  }

  public boolean usunOsobe(Osoba osoba) {
    return osoby.remove(osoba);
  }

  public NavigableSet<Osoba> zwrocStarszeOd(int wiek) {
    Osoba najmlodsza = zwrocNajmlodsza(wiek);
    if (najmlodsza == null) {
      System.out.println("Nie ma osoby starszej niż: " + wiek + "lat.");
      return Collections.emptyNavigableSet();
    }
    return osoby.tailSet(najmlodsza, true);
  }

  private Osoba zwrocNajmlodsza(int wiek) {
    for (Osoba osoba : osoby) {
      if (osoba.getWiek() > wiek) {
        return osoba;
      }
    }
    return null;
  }

  public Set<Osoba> getOsoby() {
    return osoby;
  }

  public void setOsoby(TreeSet<Osoba> osoby) {
    this.osoby = osoby;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof HashSetLearn)) {
      return false;
    }

    HashSetLearn that = (HashSetLearn) o;

    return osoby != null ? osoby.equals(that.osoby) : that.osoby == null;
  }

  @Override
  public int hashCode() {
    return osoby != null ? osoby.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "HashSetLearn{" +
        "osoby=" + osoby +
        '}';
  }
}
