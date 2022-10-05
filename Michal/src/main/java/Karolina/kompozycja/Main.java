package Karolina.kompozycja;

import Karolina.kompozycja.Artykul.Ksiegowa;

public class Main {

  public static void main(String[] args) {
    Detale detale = new Detale();
    Cena cena = new Cena();
    Lokalizacja lokalizacja = new Lokalizacja(2.0, 3.0);
    Artykul artykul = new Artykul("szafka", detale, true, cena, lokalizacja);
    Artykul artykulNullDetale = new Artykul("szafka", null, true, cena, lokalizacja);

    System.out.println(artykulNullDetale.getDetale().getKrajPochodzenia());

    artykul.zmienLokalizacje(4.0, 5.0);

    System.out.println(artykul);

    artykul.setCena(new Cena(30));

    System.out.println(artykul);

    artykul.setCena(new Cena(1200));
    System.out.println(artykul);

    Artykul.Ksiegowa ksiegowa = artykul.new Ksiegowa();
    System.out.println(ksiegowa.obliczCene());


  }

}
