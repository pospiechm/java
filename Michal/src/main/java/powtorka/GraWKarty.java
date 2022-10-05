package powtorka;

import java.util.ArrayList;



public class GraWKarty {


    public static void main(String[] args) {
        KartaDoGry damaPik = new KartaDoGry(Figura.DAMA, Kolor.PIK);
        KartaDoGry krolKaro = new KartaDoGry(Figura.KROL, Kolor.KARO);
        KartaDoGry krolPik = new KartaDoGry(Figura.KROL, Kolor.PIK);
        KartaDoGry damaKier = new KartaDoGry(Figura.DAMA, Kolor.KIER);
        KartaDoGry WaletKaro = new KartaDoGry(Figura.WALET, Kolor.KARO);
        KartaDoGry WaletPik = new KartaDoGry(Figura.WALET, Kolor.PIK);

        KartaDoGry[] kartyCpu = {damaKier, WaletKaro, WaletPik};
        KartaDoGry[] kartyMoje = {damaPik, krolKaro, krolPik};

        int wynik = 0;
        for (int i = 0; i < kartyCpu.length; i++) {
            if (kartyCpu[i].compareTo(kartyMoje[i]) > 0) {
                wynik = wynik+1;
                System.out.println("Karta komputera: "+ kartyCpu[i].getFigura() + " " + kartyCpu[i].getKolor() + " Karta gracza: " + kartyMoje[i].getFigura() + " " + kartyMoje[i].getKolor()
                 + " Wygrywa Komputer");
            } else {
                wynik =wynik-1;
                System.out.println("Karta komputera: " + kartyCpu[i].getFigura() + " " + kartyCpu[i].getKolor() + " Karta gracza: " +kartyMoje[i].getFigura() + " " + kartyMoje[i].getKolor() + " Wygrywa Gracz");
            }
        }
        if (wynik > 0) {
            System.out.println("Partię Wygrał komputer");
        } else {
            System.out.println("Partię Wygrał Gracz");
        }
    }
}