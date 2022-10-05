package Karolina.enumeryczny;

public class Zbroja {

  private Chelm chelm;
  private Tarcza tarcza;
  private Miecz miecz;

  public Zbroja(Chelm chelm, Tarcza tarcza, Miecz miecz) {
    this.chelm = chelm;
    this.tarcza = tarcza;
    this.miecz = miecz;
  }

  public Chelm getChelm() {
    return chelm;
  }

  public void setChelm(Chelm chelm) {
    this.chelm = chelm;
  }

  public Tarcza getTarcza() {
    return tarcza;
  }

  public void setTarcza(Tarcza tarcza) {
    this.tarcza = tarcza;
  }

  public Miecz getMiecz() {
    return miecz;
  }

  public void setMiecz(Miecz miecz) {
    this.miecz = miecz;
  }

  @Override
  public String toString() {
    return "Zbroja{" +
        "chelm=" + chelm +
        ", tarcza=" + tarcza +
        ", miecz=" + miecz +
        '}';
  }
}
