package Karolina.komis;

import java.awt.geom.QuadCurve2D;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {

    Samochod xceed = new Samochod(Marka.KIA, "Xceed", 2021, 90000);
    Samochod xc60 = new Samochod(Marka.BMW, "xc60", 2022, 300000);
    Samochod xceed2 = new Samochod(Marka.KIA, "Xceed", 2021, 100000);
    Samochod sportage = new Samochod(Marka.KIA, "Sportage", 2017, 120000);



    Komis komis = new Komis();
    komis.dodajSamochod(xceed);
    komis.dodajSamochod(xceed2);
    komis.dodajSamochod(xc60);
    komis.dodajSamochod(sportage);

    komis.wypiszModele();

    System.out.println("Pierwszy samochód na liście - Optional");
    System.out.println(komis.znajdzPierwszyNaLiscie());

//    System.out.println("List: " );
//    for(Samochod samochod: komis.getLista()) {
//      System.out.println(samochod);
//    }
//
//    System.out.println("Set: ");
//    for(Samochod samochod: komis.getSet()) {
//      System.out.println(samochod);
//    }

//    System.out.println("------");
//    komis.kupionoSamochod(xceed);
//
//    System.out.println("List: " );
//    for(Samochod samochod: komis.getLista()) {
//      System.out.println(samochod);
//    }
//
//    System.out.println("Set: ");
//    for(Samochod samochod: komis.getSet()) {
//      System.out.println(samochod);
//    }

//    System.out.println("------");
//    System.out.println(komis.znajdzSamochodyMarki(Marka.KIA));
//    System.out.println("------");
//    System.out.println(komis.znajdzSamochodyMarkiiModelu(Marka.KIA, "Xceed"));
//
//    System.out.println("------");
//    System.out.println(komis.znajdzSamochodyZPrzedzialuLat(2017, 2019));
//
//    System.out.println("-----");
//    System.out.println(komis.znajdzSamochodyDoKwoty(100000));
//    System.out.println("------");
//    komis.wypiszSamochody();
//
//    System.out.println("-----");
//
//    Myjnia myjnia = new Myjnia();
//
//    Queue<Samochod> kolejka = myjnia.getKolejka();
//
//    kolejka.add(sportage);
//    kolejka.add(xc60);
//    kolejka.add(xceed);
//    kolejka.add(xceed2);
//
//    myjnia.umyjSamochody();


  }

}
