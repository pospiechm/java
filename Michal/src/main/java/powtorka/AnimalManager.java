package powtorka;

public class AnimalManager {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Mruczek");
//        cat1.dajGlos();

        Animal dog1 = new Dog("Reksio");


        Animal[] animals = {cat1, dog1};
        for (int i = 0; i < animals.length; i++) {
            animals[i].dajGlos();
        }

        Bieganie cat2 = new Cat("Mruczek");
        Bieganie dog2 = new Dog("Reksio");

        Bieganie[] animals2 = {cat2, dog2};
        for (int i = 0; i < animals2.length; i++) {
            animals2[i].biegaj();
        }
    }
}
