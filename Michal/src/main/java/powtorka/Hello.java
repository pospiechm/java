package powtorka;

public class Hello {
    public static void main(String[] pola) {
        int suma = dodaj(10, 20);
        double sumaRzeczywista = dodaj(2.0, 3.0);
        System.out.println(suma);
    }

    public static int dodaj(int firstNumber, int secondNumber) {
        System.out.println("Metoda int,int");
        return firstNumber + secondNumber;
    }

    public static double dodaj(double firstNumber, double secondNumber) {
        System.out.println("Metoda double,double");
        return firstNumber + secondNumber;
    }
}
