package Karolina.cennik;

public class Produkt {

  private String nazwa;
  private Integer cena;

  public Produkt(String nazwa, Integer cena) {
    this.nazwa = nazwa;
    this.cena = cena;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public Integer getCena() {
    return cena;
  }

  public void setCena(Integer cena) {
    this.cena = cena;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Produkt)) {
      return false;
    }

    Produkt produkt = (Produkt) o;

    if (cena != produkt.cena) {
      return false;
    }
    return nazwa != null ? nazwa.equals(produkt.nazwa) : produkt.nazwa == null;
  }

  @Override
  public int hashCode() {
    int result = nazwa != null ? nazwa.hashCode() : 0;
    result = 31 * result + cena;
    return result;
  }

  @Override
  public String toString() {
    return "Produkt{" +
        "nazwa='" + nazwa + '\'' +
        ", cena=" + cena +
        '}';
  }
}
