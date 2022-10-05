package Karolina.mapy;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    Pracownik wozkowy = new Pracownik(1, "Kowalski", "wózkowy");
    Pracownik brukarz = new Pracownik(2, "Nowak", "brukarz");
    Pracownik malarz = new Pracownik(3, "Jelonkiewicz", "malarz");

    Map<Integer, Pracownik> mapa = new HashMap<>();

    mapa.put(wozkowy.getId(), wozkowy);
    mapa.put(brukarz.getId(), brukarz);
    mapa.put(malarz.getId(), malarz);

    for(Map.Entry<Integer, Pracownik> wpis : mapa.entrySet()) {
      System.out.println(wpis);
    }

    System.out.println("-----");
    System.out.println(mapa.get(1));

    System.out.println("Nie zawiera: " + mapa.containsKey(4));
    System.out.println("Zawiera: " + mapa.containsKey(3));

    System.out.println("Malarz: " + mapa.containsValue(malarz));
    System.out.println("Null" + mapa.containsValue(null));

    System.out.println("-----");
    System.out.println("Usuwam: " + mapa.remove(wozkowy.getId(), wozkowy));
    for(Map.Entry<Integer, Pracownik> wpis : mapa.entrySet()) {
      System.out.println(wpis);
    }

    System.out.println("Klucze: ");
    for(Integer klucz : mapa.keySet()) {
      System.out.println(klucz);
    }

    System.out.println("Wartości: ");
    for(Pracownik pracownik : mapa.values()) {
      System.out.println(pracownik);
    }

    System.out.println("----");
    System.out.println(mapa.getOrDefault(1, new Pracownik(0, "Default", "default")));
    for(Map.Entry<Integer, Pracownik> wpis : mapa.entrySet()) {
      System.out.println(wpis);
    }

    System.out.println("----");
    System.out.println(mapa.putIfAbsent(2, new Pracownik(0, "Default", "default")));
    for(Map.Entry<Integer, Pracownik> wpis : mapa.entrySet()) {
      System.out.println(wpis);
    }

    System.out.println("----");
    System.out.println(mapa.putIfAbsent(4, new Pracownik(0, "Default", "default")));
    for(Map.Entry<Integer, Pracownik> wpis : mapa.entrySet()) {
      System.out.println(wpis);
    }


  }

}
