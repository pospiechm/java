package Dziedziczenie.lotnictwo;

public class Pasazer {

    private int podrecznyBagaz;
    private int rejestrowanyBagaz;


    public Pasazer(int podrecznyBagaz, int rejestrowanyBagaz) {
        this.podrecznyBagaz = podrecznyBagaz;
        this.rejestrowanyBagaz = rejestrowanyBagaz;

    }

    public int getPodrecznyBagaz() {
        return podrecznyBagaz;
    }

    public int getRejestrowanyBagaz() {
        return rejestrowanyBagaz;
    }

    public void setPodrecznyBagaz(int podrecznyBagaz) {
        this.podrecznyBagaz = podrecznyBagaz;
    }

    public void setRejestrowanyBagaz(int rejestrowanyBagaz) {
        this.rejestrowanyBagaz = rejestrowanyBagaz;
    }



    @Override
    public String toString() {
        return "Pasazer{" +
                "podrecznyBagaz=" + podrecznyBagaz +
                ", rejestrowanyBagaz=" + rejestrowanyBagaz +
                '}';
    }
}
