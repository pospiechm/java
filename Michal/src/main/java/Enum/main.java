package Enum;

public class main {

    public static void main(String[] args) {
        Chelm chelm = new Chelm(Material.Braz);
        Miecz miecz = new Miecz(Material.Zelazo);
        Tarcza tarcza = new Tarcza(Material.Srebro);

        Zbroja zbroja = new Zbroja(chelm, tarcza, miecz);
        System.out.println(zbroja);


    }
}
