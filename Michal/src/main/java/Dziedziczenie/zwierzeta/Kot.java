package Dziedziczenie.zwierzeta;

import java.util.Objects;

public class Kot extends ZwierzeDomowe {
    private RasaKotow rasa;


    public Kot(Plec plec, RasaKotow rasa) {
        super(plec);
        this.rasa = rasa;
    }

    public RasaKotow getRasa() {
        return rasa;
    }

    public void setRasa(RasaKotow rasa) {
        this.rasa = rasa;
    }


    public void Miaucz() {
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return "Pies{" +
                "rasa=" + rasa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kot kot = (Kot) o;
        return rasa == kot.rasa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rasa);
    }
}
