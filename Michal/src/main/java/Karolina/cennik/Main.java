package Karolina.cennik;

import java.util.Map;

public class Main {

  public static void main(String[] args) {

    Produkt chleb = new Produkt("chleb", 8);
    Produkt mleko = new Produkt("mleko", 4);
    Produkt maslo = new Produkt("maslo", 6);

    Cennik cennik = new Cennik();
    Map<String, Integer> mapa = cennik.getCennik();
    mapa.put(chleb.getNazwa(), chleb.getCena());
    mapa.put(mleko.getNazwa(), mleko.getCena());
    mapa.put(maslo.getNazwa(), maslo.getCena());

    System.out.println(cennik.poznajCene());
  }

}
