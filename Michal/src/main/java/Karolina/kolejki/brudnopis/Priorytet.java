package Karolina.kolejki.brudnopis;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Priorytet {

  public static void main(String[] args) {

    Queue<Double> kolejka = new PriorityQueue<>();

    Random generator = new Random();

    for(int i=0; i<10; i++) {
      kolejka.offer(generator.nextDouble());
    }

    for(Double liczba: kolejka) {
      System.out.println(liczba);
    }

    System.out.println("-----");

    Iterator<Double> iterator = kolejka.iterator();

    while (iterator.hasNext()) {
      System.out.println(kolejka.poll());
    }

    System.out.println(kolejka.isEmpty());
  }

}
