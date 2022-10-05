package Karolina.biblioteka;

public class Main {

  public static void main(String[] args) {

    Ksiazka potop = new Ksiazka("Potop", "Henryk Sienkiewicz");
    Ksiazka ogniewIMieczem = new Ksiazka("Ogniem i Mieczem", "Henryk Sienkiewicz");
    Ksiazka lalka = new Ksiazka("Lalka", "Bolesław Prus");
    Ksiazka wPustyniIWPuszczy = new Ksiazka("W pustyni i w puszczy", "Henryk Sienkiewicz");
    Ksiazka harryPotter = new Ksiazka("Harry Potter", "J.K.Rowling");
    Ksiazka cleanCode = new Ksiazka("Clean code", "Robert.C.Martin");
    Ksiazka postawy = new Ksiazka("Podstawy programowania", "Programista");

    Polka polka1 = new Polka(1);
    Polka polka2 = new Polka(2);
    Polka polka3 = new Polka(3);

    polka1.dodajNaPolke(potop);
    polka1.dodajNaPolke(ogniewIMieczem);
    polka1.dodajNaPolke(lalka);
    polka1.dodajNaPolke(wPustyniIWPuszczy);

    polka2.dodajNaPolke(harryPotter);
    polka2.dodajNaPolke(cleanCode);
    polka2.dodajNaPolke(postawy);

    polka1.wypiszZawartosc();
    System.out.println("--------");
    polka2.wypiszZawartosc();
    System.out.println("--------");
    polka3.wypiszZawartosc();
    System.out.println("--------");

    polka1.zdejmijKsiazke("Lalka");
    polka1.wypiszZawartosc();
    System.out.println("--------");
    polka1.zdejmijKsiazke("Zen");
    polka1.wypiszZawartosc();
    System.out.println("--------");
    polka2.zdejmijKsiazki(0,1);
    polka2.wypiszZawartosc();
    System.out.println("--------");
    polka2.zdejmijKsiazki(9,1);
    polka2.oproznijPolke();
    polka2.wypiszZawartosc();
    polka1.liczbePozycjiNaPolce();
    polka1.numerPozycjiNaPolce(potop);


  }

}
