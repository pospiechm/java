package Karolina.cennik;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cennik {

  private Map<String, Integer> cennik;

  public Cennik() {
    this.cennik = new HashMap<>();
  }

  public Integer poznajCene() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj nazwę produktu, którego cenę chcesz poznać");
    String nazwaProduktu = scanner.nextLine();

    for(Map.Entry<String, Integer> wpis : cennik.entrySet()) {
      if(wpis.getKey().equals(nazwaProduktu)) {
        return wpis.getValue();
      }
    }
    System.out.println("Poszukiwanego produktu nie ma w cenniku.");
    return null;
  }

  public Map<String, Integer> getCennik() {
    return cennik;
  }

  public void setCennik(Map<String, Integer> cennik) {
    this.cennik = cennik;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Cennik)) {
      return false;
    }

    Cennik cennik1 = (Cennik) o;

    return cennik != null ? cennik.equals(cennik1.cennik) : cennik1.cennik == null;
  }

  @Override
  public int hashCode() {
    return cennik != null ? cennik.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Cennik{" +
        "cennik=" + cennik +
        '}';
  }
}
