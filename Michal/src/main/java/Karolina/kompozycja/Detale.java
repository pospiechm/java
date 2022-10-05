package Karolina.kompozycja;

import java.util.Objects;

public class Detale {

  private String producent;
  private String krajPochodzenia;
  private String material;

  public Detale() {}

  public Detale(String producent, String krajPochodzenia, String material) {
    this.producent = producent;
    this.krajPochodzenia = krajPochodzenia;
    this.material = material;
  }

  public String getProducent() {
    return producent;
  }

  public void setProducent(String producent) {
    this.producent = producent;
  }

  public String getKrajPochodzenia() {
    return krajPochodzenia;
  }

  public void setKrajPochodzenia(String krajPochodzenia) {
    this.krajPochodzenia = krajPochodzenia;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Detale)) {
      return false;
    }
    Detale detale = (Detale) o;
    return producent.equals(detale.producent) && krajPochodzenia.equals(detale.krajPochodzenia) && material.equals(detale.material);
  }

  @Override
  public int hashCode() {
    return Objects.hash(producent, krajPochodzenia, material);
  }

  @Override
  public String toString() {
    return "Detale{" +
        "producent='" + producent + '\'' +
        ", krajPochodzenia='" + krajPochodzenia + '\'' +
        ", material='" + material + '\'' +
        '}';
  }
}
