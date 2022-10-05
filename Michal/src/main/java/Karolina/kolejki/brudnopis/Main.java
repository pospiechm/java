package Karolina.kolejki.brudnopis;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {

    Queue<Integer> integery = new LinkedList<>();
    integery.offer(1);
    integery.offer(10);
    integery.offer(4);
    integery.offer(21);
    integery.add(19);

    for(Integer liczba: integery) {
      System.out.println(liczba);
    }

    System.out.println("-----");

    System.out.println(integery.remove());
    System.out.println("-----");
    System.out.println(integery.poll());
    System.out.println("-----");
    for(Integer liczba: integery) {
      System.out.println(liczba);
    }

    System.out.println("-----");

    System.out.println(integery.element());

  }

}
