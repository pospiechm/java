package Data220830.Kompozycja;

import java.util.Objects;

public class Artykul {
    private String nazwa;
    private Detal detal;
    private Cena cena;
    private Lokalizacja lokalizacja;
    private boolean dostepnosc;

    public Artykul(String nazwa, Detal detal, boolean dostepnosc, Cena cena, Lokalizacja lokalizacja) {
        this.nazwa = nazwa;
        this.detal = detal;
        this.cena = cena;
        this.lokalizacja = lokalizacja;
        this.dostepnosc = dostepnosc;
    }


    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setDostepnosc(boolean dostepnosc) {
        this.dostepnosc = dostepnosc;
    }
// Zmiana lokalizacji metodą
//    public void zmienLokalizacje(double x, double y) {
//        lokalizacja.setX(x);
//        lokalizacja.setY(y);
//
//    }


    public Lokalizacja getLokalizacja() {
        return lokalizacja;
    }

    public void setLokalizacja(Lokalizacja lokalizacja) {
        this.lokalizacja = lokalizacja;
    }

    public void zmienDetal(String producent, String krajPochodzenia, String materialWykonania) {
        detal.setProducent(producent);
        detal.setKrajPochodzenia(krajPochodzenia);
        detal.setMaterialWykonania(materialWykonania);

    }
// Uwarunkowanie ceny metodą
//    public void zmienCene(int wartosc) {
//        if (wartosc >= 1 && wartosc <= 1000) {
//            cena.setWartosc(wartosc);
//        } else {
//            System.out.println("Cena musi być między 1 a 1000");
//        }
//    }

// Podejście z obiektem cena
        public void zmienCene(Cena cena) {
        int wartosc = cena.getWartosc();
        if (wartosc >= 1 && wartosc <= 1000) {
            this.cena = cena;
        } else {
            System.out.println("Cena musi być między 1 a 1000");
        }
    }

    @Override
    public String toString() {
        return "Artykul{" +
                "nazwa='" + nazwa + '\'' +
                ", detal=" + detal +
                ", cena=" + cena +
                ", lokalizacja=" + lokalizacja +
                ", dostepnosc=" + dostepnosc +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artykul artykul = (Artykul) o;
        return dostepnosc == artykul.dostepnosc && nazwa.equals(artykul.nazwa) && detal.equals(artykul.detal) && cena.equals(artykul.cena) && lokalizacja.equals(artykul.lokalizacja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, detal, cena, lokalizacja, dostepnosc);
    }
}

