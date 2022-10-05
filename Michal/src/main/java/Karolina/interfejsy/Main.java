package Karolina.interfejsy;

public class Main {

  public static void main(String[] args) {

    Okrag okrag = new Okrag(2);
    Prostokat prostokat = new Prostokat(3,4);
    TrojkatProstokatny trojkat = new TrojkatProstokatny(3,4,5);

    Object [] figury = {okrag, prostokat, trojkat};
    System.out.println(figury[5]);

    System.out.println(figury[-1]);

    System.out.println("Okrag: obwód" + okrag.obliczObwod() + "pole:" + okrag.obliczPole() );
    System.out.println("Prostokąt: obwód: "+ prostokat.obliczObwod() + "pole: " + prostokat.obliczPole());
    System.out.println("Trójkąt: obwód: " + trojkat.obliczObwod() + "pole: " + trojkat.obliczPole());

    for(Object figura: figury) {
      System.out.println(figura);
    }

  }

}
