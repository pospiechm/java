package powtorka;

public class Dog extends Animal implements Bieganie{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void dajGlos() {
        System.out.println("Jestem psem");
    }

    @Override
    public void biegaj() {
        System.out.println("Biegnę");
    }
}
