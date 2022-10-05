package Data220830.Kompozycja;

import java.util.Objects;

public class Detal {
    String producent;
    String krajPochodzenia;
    String materialWykonania;

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public void setKrajPochodzenia(String krajPochodzenia) {
        this.krajPochodzenia = krajPochodzenia;
    }

    public void setMaterialWykonania(String materialWykonania) {
        this.materialWykonania = materialWykonania;
    }

    @Override
    public String toString() {
        return "Detal{" +
                "producent='" + producent + '\'' +
                ", krajPochodzenia='" + krajPochodzenia + '\'' +
                ", materialWykonania='" + materialWykonania + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detal detal = (Detal) o;
        return producent.equals(detal.producent) && krajPochodzenia.equals(detal.krajPochodzenia) && materialWykonania.equals(detal.materialWykonania);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producent, krajPochodzenia, materialWykonania);
    }
}
