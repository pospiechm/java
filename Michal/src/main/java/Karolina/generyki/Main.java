package Karolina.generyki;

public class Main {

  public static void main(String[] args) {

    Ryba ryba = new Ryba("plaszczka");
    Krab krab = new Krab("pustynny");
    KonikMorski konikMorski = new KonikMorski("konik");

    Akwarium<Ryba> akwariumRyb = new Akwarium<>(ryba);
    Akwarium<Krab> akwariumKrab = new Akwarium<>(krab);
    Akwarium<KonikMorski> akwariumKonikMorski = new Akwarium<>(konikMorski);
//    Akwarium<Integer> akwariumLiczb = new Akwarium<>(new Integer(1));
  }

}
