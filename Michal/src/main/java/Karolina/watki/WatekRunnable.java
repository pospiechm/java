package Karolina.watki;

public class WatekRunnable {

    public static void main(String[] args) {

        System.out.println("Wątek główny zaczyna");

        Thread watek = new Thread(() -> {
            System.out.println("Drugi wątek zaczyna");
            for (int i=0; i<5; i++){
                System.out.println("Drugi watek: " + i);
            }
            System.out.println("Drugi wątek kończy");
        });

    watek.start();
    for (int i=0; i<5; i++) {
        System.out.println("Wątek główny: "+ i);
    }
        System.out.println("Wątek główny kończy");
    }
}
