package Karolina.osoby;

public class Main {

  public static void main(String[] args) {

    Osoba jan = new Osoba("Kowalski", 33);
    Osoba krzysztof = new Osoba("Makowski", 54);
    Osoba zenon = new Osoba("Taki", 78);

    RejestrOsob rejestrOsob = new RejestrOsob();
    rejestrOsob.dodajOsobe(jan);
    rejestrOsob.dodajOsobe(jan);
    rejestrOsob.dodajOsobe(krzysztof);
    rejestrOsob.dodajOsobe(zenon);

    rejestrOsob.wypiszListe();

    System.out.println(rejestrOsob.avg());
    System.out.println(rejestrOsob.min());
    System.out.println(rejestrOsob.max());

    rejestrOsob.usunOsobe(jan);

    rejestrOsob.wypiszListe();
  }
}
