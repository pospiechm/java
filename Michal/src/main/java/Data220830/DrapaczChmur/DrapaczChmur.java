package Data220830.DrapaczChmur;

public class DrapaczChmur {
private int liczbaPieter;
private String developer;
    public DrapaczChmur() {
        this.liczbaPieter = 10;
        this.developer = "SDA Developer";
    }
    public DrapaczChmur(int liczbaPieter, String developer) {
        this.liczbaPieter = liczbaPieter;
        this.developer = developer;
    }



    public static void main (String[] Args) {
        DrapaczChmur drapaczChmur1 = new DrapaczChmur();
        System.out.println(drapaczChmur1.liczbaPieter);
        System.out.println(drapaczChmur1.developer);
        DrapaczChmur drapaczChmur2 = new DrapaczChmur(20, "ATAL");
        System.out.println(drapaczChmur2.liczbaPieter);
        System.out.println(drapaczChmur2.developer);

    }
}



