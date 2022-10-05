package Data220830.Kompozycja;

public class App {

    public static void main(String[] args) {
        Detal detal = new Detal();
        Cena cena = new Cena();
        Lokalizacja lokalizacja = new Lokalizacja(2, 3);
        Artykul artykul = new Artykul("szafka", detal, true, cena, lokalizacja);

        System.out.println(artykul);
        // artykul.zmienLokalizacje(4, 5);
       // artykul.zmienCene(new Cena(800));
        artykul.setNazwa("półka");
        artykul.setDostepnosc(false);
        artykul.zmienDetal("ikea", "Szwecja", "Drewno");
        System.out.println(artykul);
    }
}
