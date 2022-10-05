package Karolina.enumeryczny;


public class Main {

  public static void main(String[] args) {
    Chelm chelm = new Chelm(Material.ZELAZO);
    Miecz miecz = new Miecz(Material.BRĄZ);
    Tarcza tarcza = new Tarcza(Material.BRĄZ);

    Zbroja zbroja = new Zbroja(chelm, tarcza, miecz);

    System.out.println(zbroja);
  }

}
