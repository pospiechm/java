package Karolina.sety.osoby;

public class Main {

  public static void main(String[] args) {
    Osoba jan = new Osoba("Jan", "Kowalski", 30);
    Osoba krzysiek = new Osoba("Krzysztof", "Zalewski", 45);
    Osoba zosia = new Osoba("Zosia", "Blada", 3);
    Osoba kasia = new Osoba("Kasia", "Taka", 1);

    HashSetLearn hashSetLearn = new HashSetLearn();
    hashSetLearn.dodajOsobe(jan);
    hashSetLearn.dodajOsobe(krzysiek);
    hashSetLearn.dodajOsobe(zosia);
    hashSetLearn.dodajOsobe(kasia);

    for (Osoba osoba : hashSetLearn.getOsoby()) {
      System.out.println(osoba);
    }

    System.out.println("------");
    System.out.println(hashSetLearn.zwrocStarszeOd(70));

    Comparable<Integer> comparable = (liczba) -> 0;
  }

}
