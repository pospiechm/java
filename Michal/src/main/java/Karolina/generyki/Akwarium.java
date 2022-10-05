package Karolina.generyki;

public class Akwarium<T extends Stworzenie> {

  private final T stworzenie;

  public Akwarium(T swtorzenie) {
    this.stworzenie = swtorzenie;
  }

  public void ogladaj() {
    System.out.println("Oglądam: " + stworzenie);
  }
}
