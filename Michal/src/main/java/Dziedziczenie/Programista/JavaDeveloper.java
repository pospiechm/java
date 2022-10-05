package Dziedziczenie.Programista;

public class JavaDeveloper extends Programista {
    private String specjalnosc;
    private String framework;


    public JavaDeveloper(String imie, String nazwisko, int wiek, String zawod, int stazPracy, JezykProgramowania jezykProgramowania, Poziom poziom, String specjalnosc, String framework) {
        super(imie,nazwisko,wiek,zawod,stazPracy,jezykProgramowania,poziom);
        this.specjalnosc = specjalnosc;
        this.framework = framework;

        System.out.println("To jest konstruktor Java Developera");
    }

}
