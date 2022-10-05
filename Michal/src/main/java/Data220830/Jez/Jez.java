package Data220830.Jez;

public class Jez {

    public void eat(Jablko jablko){
        System.out.println("Jeż jest syty");
    }
    public static class Jablko{
            }

    public static void main(String[] args) {

        Jablko jablko = new Jablko();
        new Jez().eat(jablko);
    }
}
