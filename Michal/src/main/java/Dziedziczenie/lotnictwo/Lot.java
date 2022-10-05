package Dziedziczenie.lotnictwo;

public class Lot {

    private int pasazerowie;
    private int siedzenia;
    private int bagaze;


    public Lot(int pasazerowie, int siedzenia) {
        this.pasazerowie = pasazerowie;
        this.siedzenia = siedzenia;
        this.bagaze = bagaze;

    }

    public Lot() {
        this.pasazerowie = 0;
        this.siedzenia = 150;
        this.bagaze = 0;
       }

    public int getPasazerowie() {
        return pasazerowie;
    }

    public int getSiedzenia() {
        return siedzenia;
    }

    public void setPasazerowie(int pasazerowie) {
        this.pasazerowie = pasazerowie;
    }

    public void setSiedzenia(int siedzenia) {
        this.siedzenia = siedzenia;
    }

    public void dodajPasazera() {
        if (czySaMiejsca()) {
            pasazerowie +=1;
        } else zaDuzoPasazerow();

    }

    public void dodajPasazera(Pasazer pasazer) {
        dodajPasazera(pasazer.getRejestrowanyBagaz());
    }

    public void dodajPasazera(int bagazRejestrowany) {
        Pasazer pasazer = new Pasazer(0,1);
        if (czySaMiejsca()) {
            pasazerowie +=1;
            bagaze += bagazRejestrowany;
        } else zaDuzoPasazerow();

    }

    private boolean czySaMiejsca() {
          return siedzenia > pasazerowie;
    }


    // 05.09.2022
    // dodajPasazera -> ma argument w postaci int (bagaż),
    // jeśli  if (siedzenia > pasazerowie) to zwiększ liczbę pasażerów
    // i  zwieksz ilość rejestrowanego bagazu jak nie ma miejsca -> zaDuzoPasazerow
private void zaDuzoPasazerow(){
    System.out.println("Za dużo pasażerów");
}

    @Override
    public String toString() {
        return "Lot{" +
                "pasazerowie=" + pasazerowie +
                ", siedzenia=" + siedzenia +
                '}';
    }
}