package Karolina.funkcyjne;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Zadania {


  public static void main(String[] args) {

    Function<Integer, Integer> oblicz = (liczba) -> {
      Integer wynik = 0;
      for (int i = 1; i <= liczba; i++) {
        wynik += i;
      }
      return wynik;
    };

    System.out.println(oblicz.apply(3));

    Supplier<Integer> wygeneruj = () -> {
      Random generator = new Random();
      return generator.nextInt(0,10);
    };

    System.out.println(wygeneruj.get());

    Consumer<String> podzielTekst = (tekst) -> {
      String [] tablica = tekst.split("");
      for(String znak: tablica) {
        System.out.println(znak);
      }
    };

    podzielTekst.accept("hulajnoga");

    Predicate<Integer> podzielna = (liczba) -> liczba%2 == 0;
    System.out.println(podzielna.test(10));

    System.out.println("-------");


    Random random = new Random();
    List<Integer> lista = new ArrayList<>();

    for(int i = 0; i<=10; i++) {
      Integer liczba = random.nextInt();
      lista.add(liczba);
      System.out.println(liczba);
    }

    System.out.println("-----");

    lista.stream().filter(liczba -> liczba%2 == 0).forEach(System.out::println);
  }

}
