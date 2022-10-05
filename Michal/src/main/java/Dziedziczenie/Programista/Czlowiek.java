package Dziedziczenie.Programista;

public class Czlowiek {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String zawod;

    public Czlowiek(String imie, String nazwisko, int wiek, String zawod) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.zawod = zawod;

        System.out.println("To jest konstruktor Człowieka");
    }
}
