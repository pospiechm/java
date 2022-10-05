package Enum;

public enum Material {
    Zelazo (1000, "Żelazo"),
    Srebro (500, "Srebro"),
    Braz (100, "Brąz");

private final float twardosc;
private final String nazwa;

Material (int twardosc, String nazwa){
    this.twardosc = twardosc;
    this.nazwa = nazwa;

}

    public float getTwardosc() {
        return twardosc;
    }

    public String getNazwa() {
    return nazwa;
    }
}
