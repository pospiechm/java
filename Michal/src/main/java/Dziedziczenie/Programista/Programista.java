package Dziedziczenie.Programista;

public class Programista extends Czlowiek {
    private int stazPracy;
    private JezykProgramowania jezykProgramowania;
    private Poziom poziom;

    public Programista(String imie, String nazwisko, int wiek, String zawod, int stazPracy, JezykProgramowania jezykProgramowania, Poziom poziom) {
        super(imie,nazwisko,wiek,zawod);
        this.stazPracy = stazPracy;
        this.jezykProgramowania = jezykProgramowania;
        this.poziom = poziom;

        System.out.println("To jest konstruktor Programisty");
    }

}
