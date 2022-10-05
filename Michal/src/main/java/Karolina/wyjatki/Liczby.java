package Karolina.wyjatki;

import java.util.Scanner;

public class Liczby {

  public static void pobierzLiczbe() {

    boolean sukces = false;
    do {
      Scanner scanner = new Scanner(System.in);
      try {
        System.out.println("Podaj liczbę całkowitą");
        int liczba = scanner.nextInt();
        sukces = true;
        System.out.println("Poprawne dane. Liczba: " + liczba);
      } catch (RuntimeException e) {
        System.out.println("Wprowadzono błędne dane. Podaj liczbę.");
      }
    } while(!sukces);

  }

  public static void main(String[] args) {
    pobierzLiczbe();
  }

}
