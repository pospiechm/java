package Data220830.Kontynenty;

public class Kontynenty {

    public static class Europa  {
        private final int powierzchnia; //private final oznacza że wartość jest niezmienna;

        public Europa(int powierzchnia) {
            this.powierzchnia = powierzchnia;
        }
    }

    public static class Azja {
        private final int powierzchnia;

        public Azja(int powierzchnia) {
            this.powierzchnia = powierzchnia;
        }

    }

    public static class Afryka {
        private final int powierzchnia;

        public Afryka(int powierzchnia) {
            this.powierzchnia = powierzchnia;
        }
    }

    public static void main(String[] args) {

     new Europa(30370000);
     new Afryka(521654515);
     new Azja(651651656);


     }

}
