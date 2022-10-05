package Dziedziczenie.lotnictwo;

public class Main {
    public static void main(String[] args) {
        LotCargo lotCargo = new LotCargo();
        lotCargo.dodajPaczke(3,2,8);
        Pasazer kasia = new Pasazer(1,1);
        lotCargo.dodajPasazera(kasia);

        Lot lot = new LotCargo();

        System.out.println(lotCargo);
        System.out.println(kasia);

        // przykłady dziedziczenia
    Lot [] loty = new Lot[4];
    loty[0] = new Lot();
    loty[1] = new LotCargo();

    Lot warszawaLot = new Lot();
    LotCargo katowiceLot = new LotCargo();

        System.out.println(warszawaLot.getSiedzenia());
        System.out.println(katowiceLot.getSiedzenia());
    }

}
