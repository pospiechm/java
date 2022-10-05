package Dziedziczenie.zwierzeta;

public class Main {
    public static void main(String[] args) {
        Pies reksio = new Pies(Plec.SAMIEC, RasaPsow.SZNAUCER);
        Kot filemon = new Kot(Plec.SAMIEC, RasaKotow.MAINE_COON);
        filemon.setWiek(5);
        reksio.setWiek(4);

        ZwierzeDomowe[] zwierzeta = new ZwierzeDomowe[2];
        zwierzeta[0] = reksio;
        zwierzeta[1] = filemon;

        for (ZwierzeDomowe zwierze : zwierzeta) {
            System.out.println(zwierze);
        }
    }
}
