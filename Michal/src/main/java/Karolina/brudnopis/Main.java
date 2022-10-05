package Karolina.brudnopis;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {

    NavigableSet<Double> treesetDoubli = new TreeSet<>();
    treesetDoubli.add(1.0);
    treesetDoubli.add(5.0);
    treesetDoubli.add(3.0);
    treesetDoubli.add(10.0);

    for(Double liczba: treesetDoubli){
      System.out.println(liczba);
    }

    System.out.println("First: " + treesetDoubli.first());
    System.out.println("Last: " + treesetDoubli.last());




  }

}
