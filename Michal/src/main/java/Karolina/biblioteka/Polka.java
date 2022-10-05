package Karolina.biblioteka;

import java.util.ArrayList;
import java.util.List;

public class Polka {

  private int numerPolki;
  private List<Ksiazka> polka;

  public Polka(int numerPolki) {
    this.numerPolki = numerPolki;
    this.polka = new ArrayList<>();
  }

  public boolean dodajNaPolke(Ksiazka ksiazka) {
    return polka.add(ksiazka);
  }

  public void wypiszZawartosc() {
    if(polka.isEmpty()) {
      System.out.println("Na tej półce nie ma żadnych książek");
    }
    for(Ksiazka ksiazka : polka) {
      System.out.println(ksiazka);
    }
  }

  public boolean zdejmijKsiazke(String tytuł) {
    for(Ksiazka ksiazka : polka) {
      if(ksiazka.getNazwa().equals(tytuł)) {
        return polka.remove(ksiazka);
      }
    }
    System.out.println("Na półce nie ma książki z tytułem: " + tytuł);
    return false;
  }


  public boolean zdejmijKsiazki(int indeksOd, int indeksDo) {
    int rozmiar = polka.size(); // jesli lista ma 4 elementy - to size = 4 ale indeksy 0,1,2,3
    if(indeksOd > indeksDo || indeksOd >= rozmiar || indeksDo >=rozmiar || indeksOd < 0 || indeksDo < 0) {
      System.out.println("Błędne dane wejściowe, nie da się stworzyć podlisty");
      return false;
    }
    List<Ksiazka> subLista = polka.subList(indeksOd, indeksDo);
    return polka.removeAll(subLista);
  }

  public void oproznijPolke() {
    polka.clear();
  }

  public int liczbePozycjiNaPolce() {
    int rozmiar = polka.size();
    System.out.println("Na półce jest: " + rozmiar + "książek.");
    return rozmiar;
  }

  public int numerPozycjiNaPolce(Ksiazka ksiazka) {
    int indeks = polka.indexOf(ksiazka);
    if(indeks == -1) {
      System.out.println("Na półce nie ma książki: " + ksiazka);
    }
    System.out.println("Numer książki: " + ksiazka +  " na pólce to: " + indeks);
    return indeks;
  }

  public int getNumerPolki() {
    return numerPolki;
  }

  public void setNumerPolki(int numerPolki) {
    this.numerPolki = numerPolki;
  }

  public List<Ksiazka> getPolka() {
    return polka;
  }

  public void setPolka(List<Ksiazka> polka) {
    this.polka = polka;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Polka)) {
      return false;
    }

    Polka polka1 = (Polka) o;

    if (numerPolki != polka1.numerPolki) {
      return false;
    }
    return polka != null ? polka.equals(polka1.polka) : polka1.polka == null;
  }

  @Override
  public int hashCode() {
    int result = numerPolki;
    result = 31 * result + (polka != null ? polka.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Polka{" +
        "numerPolki=" + numerPolki +
        ", polka=" + polka +
        '}';
  }
}
