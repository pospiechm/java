package powtorka;

public class Cat extends Animal implements Bieganie{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void dajGlos() {
        System.out.println("Jestem kot");
    }

    @Override
    public void biegaj() {
        System.out.println("Skradam się");
    }
}
