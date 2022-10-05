package Karolina.watki;

public class WatkiProgram {
// Napisz program, który uruchomi trzy wątki. Pierwszy z nich będzie wypisywał w pętli ciąg znaków Hello , drugi world, trzeci !\n (wykrzyknik ze znakiem nowej linii).

    public static void main(String[] args) {
        Thread watek1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
            }
        });

        Thread watek2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("world");
            }
        });

        Thread watek3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("!\n");
            }
        });

        watek1.start();
        watek2.start();
        watek3.start();

    }
}
