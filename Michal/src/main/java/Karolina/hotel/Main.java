package Karolina.hotel;

import static Karolina.hotel.Hotel.APARTAMENT_1;
import static Karolina.hotel.Hotel.APARTAMENT_2;
import static Karolina.hotel.Hotel.POKOJ_EKONOMICZNY_1;
import static Karolina.hotel.Hotel.POKOJ_PODSTAWOWY_2;

import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

  public static void main(String[] args) {


    Gosc janKowalki = new Gosc("Jan", "Kowalski");
    Gosc adrianNowak = new Gosc("Adrian", "Nowak");
    Gosc kasiaSkrzynecka = new Gosc("Katarzyna", "Skrzynecka");
    Gosc halinaPoswiatowska = new Gosc("Halina", "Poswiatowska");
    Gosc alinaHaszlo = new Gosc("Alina", "Haszlo");


    Hotel hotel = new Hotel("Krakowski hotel", "Kraków");

    hotel.wypiszHotel();

    System.out.println("----");
    hotel.zameldujGoscia(APARTAMENT_1, janKowalki);
    hotel.zameldujGoscia(APARTAMENT_2, alinaHaszlo);
    hotel.zameldujGoscia(POKOJ_EKONOMICZNY_1, adrianNowak);

    hotel.wypiszHotel();

    System.out.println("-----");
    hotel.wymeldujGoscia(alinaHaszlo);
    hotel.wypiszHotel();
    hotel.wymeldujGoscia(kasiaSkrzynecka);

    System.out.println("-----");
    System.out.println(hotel.znajdzGosciaPoNumerzePokoju(8));
    System.out.println("------");
    System.out.println(hotel.znajdzGosciaPoNumerzePokoju(12));
    System.out.println("------");
    System.out.println(hotel.znajdzNumerPokojuPoNazwiskuGoscia("Kowalski"));

    System.out.println("-----");
    System.out.println(hotel.znajdzWolnePokojeWStandardzie(Standard.PREMIUM));

    System.out.println("------");

    SiecHoteli siecHoteli = new SiecHoteli();
    Map<Pokoj, Gosc> mapaPokoiZakopane = siecHoteli.getSiecHoteli().get("Zakopane").getMapaPokoi();
    Map<Pokoj, Gosc> mapaPokoiKrakow = siecHoteli.getSiecHoteli().get("Kraków").getMapaPokoi();
    Map<Pokoj, Gosc> mapaPokoiWarszawa = siecHoteli.getSiecHoteli().get("Warszawa").getMapaPokoi();

    mapaPokoiZakopane.put(APARTAMENT_1, halinaPoswiatowska);
    mapaPokoiWarszawa.put(POKOJ_PODSTAWOWY_2, alinaHaszlo);
    mapaPokoiKrakow.put(APARTAMENT_1, adrianNowak);
    mapaPokoiKrakow.put(POKOJ_PODSTAWOWY_2, kasiaSkrzynecka);

    System.out.println(siecHoteli.liczbaGosciZameldowanychWSieci());
    System.out.println(siecHoteli.znajdzListeWolnychPokoiWMiescie("Kraków"));


    System.out.println("Lista Wolnych Pokoi");
    System.out.println(hotel.zwrocListeWolnychPokoi());

    System.out.println("Lista pokoi w standardzie stream");
    System.out.println(hotel.znajdzWolnePokojeWstandardzieStream(Standard.EKONOMICZNY));

    System.out.println("Znajdź numer pokoju po nazwisku OPTIONAL");
    hotel.znajdzNumerPokojuPoNazwiskuGosciaOptional("Kowalski").ifPresentOrElse(System.out::println, () -> System.out.println("NIE MA"));
    hotel.znajdzNumerPokojuPoNazwiskuGosciaOptional("Krzak").ifPresentOrElse(System.out::println, () -> System.out.println("NIE MA"));


    System.out.println("znajdzNumerPokojuPoNazwiskuGosciaOptionalStream");
    hotel.znajdzNumerPokojuPoNazwiskuGosciaOptionalStream("Kowalski").ifPresentOrElse(System.out::println, () -> System.out.println("NIE MA"));
    System.out.println(hotel.znajdzNumerPokojuPoNazwiskuGosciaOptionalStream("Kowalski"));
    hotel.znajdzNumerPokojuPoNazwiskuGosciaOptionalStream("Krzak").ifPresentOrElse(System.out::println, () -> System.out.println("NIE MA"));
  }

}
