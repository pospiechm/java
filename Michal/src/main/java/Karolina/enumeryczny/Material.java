package Karolina.enumeryczny;

public enum Material {

  ZELAZO(1.0, "żelazo"),
  SREBRO(0.5, "srebro"),
  BRĄZ(0.75, "brąz")
  ;

  private final double twardosc;
  private final String nazwa;

  Material(double twardosc, String nazwa) {
    this.twardosc = twardosc;
    this.nazwa = nazwa;
  }

  public double getTwardosc() {
    return twardosc;
  }

  public String getNazwa() {
    return nazwa;
  }
}
