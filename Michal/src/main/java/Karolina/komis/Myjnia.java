package Karolina.komis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.stream.Stream;

public class Myjnia {

  private Queue<Samochod> kolejka;

  public Myjnia() {
    this.kolejka = new LinkedList<>();
  }

  public void umyjSamochody() {
    Iterator<Samochod> iterator = kolejka.iterator();
    while (iterator.hasNext()) {
      System.out.println("Umyto: " + kolejka.remove());
    }
  }

  public Queue<Samochod> getKolejka() {
    return kolejka;
  }

  public void setKolejka(Queue<Samochod> kolejka) {
    this.kolejka = kolejka;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Myjnia)) {
      return false;
    }

    Myjnia myjnia = (Myjnia) o;

    return kolejka != null ? kolejka.equals(myjnia.kolejka) : myjnia.kolejka == null;
  }

  @Override
  public int hashCode() {
    return kolejka != null ? kolejka.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Myjnia{" +
        "kolejka=" + kolejka +
        '}';
  }
}

