package Dziedziczenie.zwierzeta;

import java.util.Objects;

public class Pies extends ZwierzeDomowe {
    private RasaPsow rasa;


    public Pies(Plec plec, RasaPsow rasa) {
           super(plec);
            this.rasa = rasa;
    }

    public RasaPsow getRasa() {
        return rasa;
    }

    public void setRasa(RasaPsow rasa) {
        this.rasa = rasa;
    }


    public void szczekaj() {
        System.out.println("Dzwiek");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pies pies = (Pies) o;
        return rasa == pies.rasa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rasa);
    }

    @Override
    public String toString() {
        return "Pies{" +
                "rasa=" + rasa +
                '}';
    }
}
