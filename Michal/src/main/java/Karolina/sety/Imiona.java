package Karolina.sety;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Imiona {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj kilka imion.");
    String [] slowa = scanner.nextLine().split(" ");
    Set<String> pojedynczeSlowa = new HashSet<>();

    for(String slowo : slowa) {
      pojedynczeSlowa.add(slowo);
    }

    Iterator<String> iterator = pojedynczeSlowa.iterator();

    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
