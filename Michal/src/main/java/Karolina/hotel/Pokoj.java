package Karolina.hotel;

public class Pokoj {

  private int numerPokoju;
  private Standard standard;

  public Pokoj(int numerPokoju, Standard standard) {
    this.numerPokoju = numerPokoju;
    this.standard = standard;
  }

  public int getNumerPokoju() {
    return numerPokoju;
  }

  public void setNumerPokoju(int numerPokoju) {
    this.numerPokoju = numerPokoju;
  }

  public Standard getStandard() {
    return standard;
  }

  public void setStandard(Standard standard) {
    this.standard = standard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Pokoj)) {
      return false;
    }

    Pokoj pokoj = (Pokoj) o;

    if (numerPokoju != pokoj.numerPokoju) {
      return false;
    }
    return standard == pokoj.standard;
  }

  @Override
  public int hashCode() {
    int result = numerPokoju;
    result = 31 * result + (standard != null ? standard.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Pokoj{" +
        "numerPokoju=" + numerPokoju +
        ", standard=" + standard +
        '}';
  }
}
