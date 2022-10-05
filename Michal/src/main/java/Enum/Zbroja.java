package Enum;

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

    public Tarcza getTarcza() {
        return tarcza;
    }

    public Miecz getMiecz() {
        return miecz;
    }

    public void setChelm(Chelm chelm) {
        this.chelm = chelm;
    }

    public void setTarcza(Tarcza tarcza) {
        this.tarcza = tarcza;
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
