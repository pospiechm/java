package InterfejsyFunkcjonalne;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfejsyFunkcjonalne {



    public static void main(String[] args) {

        // Function sumujący liczby od 1 do n

        Function<Integer, Integer> sum = (n) -> {
            Integer wynik = 0;
            for (int i = 1; i <= n; i++) {
                wynik += i;
            }
            return wynik;
        };
        System.out.println(sum.apply(10));

        //Supplier dający losową liczbę od 1 do 10

        Supplier<Integer> losowaLiczba = ()-> {
            Random generator = new Random();
            return generator.nextInt(0,10);
        };

        System.out.println(losowaLiczba.get());

        // Consumer zamieniający słowo na literki w każdej linii
        Consumer <String> podzielTekst = (tekst)-> {
            String [] tablica = tekst.split("");
            for(int i=0; i<tekst.length(); i++){
                System.out.println(tekst.charAt(i));
            }
        };

        podzielTekst.accept("Kotek");

        // Pradicate czy liczba jest podzielna przez 2

        Predicate<Integer> czyPodzielnaPrzezDwa = (liczba) -> liczba % 2 == 0;
        System.out.println(czyPodzielnaPrzezDwa.test(6
        ));


    }
}
