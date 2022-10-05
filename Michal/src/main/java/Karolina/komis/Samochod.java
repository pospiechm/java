package Karolina.komis;

public class  Samochod {

  private Marka marka;
  private String model;
  private int rokProdukcji;
  private int cena;

  public Samochod(Marka marka, String model, int rokProdukcji, int cena) {
    this.marka = marka;
    this.model = model;
    this.rokProdukcji = rokProdukcji;
    this.cena = cena;
  }

  public Marka getMarka() {
    return marka;
  }

  public void setMarka(Marka marka) {
    this.marka = marka;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getRokProdukcji() {
    return rokProdukcji;
  }

  public void setRokProdukcji(int rokProdukcji) {
    this.rokProdukcji = rokProdukcji;
  }

  public int getCena() {
    return cena;
  }

  public void setCena(int cena) {
    this.cena = cena;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Samochod)) {
      return false;
    }

    Samochod samochod = (Samochod) o;

    if (rokProdukcji != samochod.rokProdukcji) {
      return false;
    }
    if (marka != samochod.marka) {
      return false;
    }
    return model != null ? model.equals(samochod.model) : samochod.model == null;
  }

  @Override
  public int hashCode() {
    int result = marka != null ? marka.hashCode() : 0;
    result = 31 * result + (model != null ? model.hashCode() : 0);
    result = 31 * result + rokProdukcji;
    return result;
  }

  @Override
  public String toString() {
    return "Samochod{" +
        "marka=" + marka +
        ", model='" + model + '\'' +
        ", rokProdukcji=" + rokProdukcji +
        ", cena=" + cena +
        '}';
  }
}
