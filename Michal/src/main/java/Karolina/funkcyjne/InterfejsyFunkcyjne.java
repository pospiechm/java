package Karolina.funkcyjne;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfejsyFunkcyjne {

  public static void main(String[] args) {
    Runnable runnable = () -> System.out.println("Say hi");

    Predicate<Integer> predykat = (liczba) -> liczba > 0;

    predykat.test(5);

    Consumer<String> konsumer = (tekst) -> System.out.println(tekst);
    konsumer.accept("Czesc");

    Supplier<Integer> dostawca = () -> {
      Random generator = new Random();
      return generator.nextInt();
    };

    dostawca.get();

    Function<Integer, Integer> funkcja = (liczba) -> liczba + 2;
    funkcja.apply(2);
  }

}
