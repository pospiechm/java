package Karolina.funkcyjne;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamy {

  public static void main(String[] args) {

    List<Integer> lista = new ArrayList<>();
    lista.add(10);
    lista.add(-2);
    lista.add(1);
    lista.add(-7);
    lista.add(2);

    System.out.println(lista.stream().filter(liczba -> liczba > 0).sorted().collect(toList()));
    lista.stream().forEach(System.out::println);



  }

}
