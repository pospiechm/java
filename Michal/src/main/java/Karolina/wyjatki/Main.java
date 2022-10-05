package Karolina.wyjatki;

public class Main {

  public static void main(String[] args) {

    int i = 12;
    int j = 2;

    try {
      int wynik = i / (j - 2);
      System.out.println(wynik);
    } catch(Exception e) {
      System.out.println("Błąd: " + e.getMessage() + e.getStackTrace());
    }

  }
}
