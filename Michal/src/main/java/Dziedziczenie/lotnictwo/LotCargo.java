package Dziedziczenie.lotnictwo;

public class LotCargo extends Lot {

    private final float maxPrzestrzenCargo = 1000.0f;
    private float uzywanaPrzestrzenCargo;

    //stwórz metode cargoMaMiejsce() -> przyjmuje objętość i zwraca zuzyta przestrzen
    //stwórz metode dodajPaczke() -> argumenty 3 wymiary paczki
    //jezeli jest jeszcze miejsce to zwiększ uzywana przestrzen a w innym przypadku wypisz ze nie ma miejsca

    private boolean cargoMaMiejsce(int objetosc) {
        return objetosc + uzywanaPrzestrzenCargo <= maxPrzestrzenCargo;
    }

    public void dodajPaczke(int x, int y, int z) {
        int objetosc = x * y * z;
        if (cargoMaMiejsce(objetosc)) {
            uzywanaPrzestrzenCargo += objetosc;
        } else {
            System.out.println("Brak miejsca");
        }
    }

    @Override
    public int getSiedzenia() {
        return 12;
    }

    @Override
    public String toString() {
        return "LotCargo{" +
                "maxPrzestrzenCargo=" + maxPrzestrzenCargo +
                ", uzywanaPrzestrzenCargo=" + uzywanaPrzestrzenCargo +
                '}';
    }
}
