package Data220830.iPhony;

import java.util.Objects;
public class Iphone {


//    Porównaj dwa iPhony. Stwórz nową kalsę Iphone i porównaj dwa telefony (model, kolor, cena). Pola
//    model, kolor, cena powinny być prywatne.

private String model;
private String color;
private int cena;

    public Iphone(String model, String color, int cena) {
        this.model = model;
        this.color = color;
        this.cena = cena;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("Iphone10", "Black", 99);
        Iphone iphone2 = new Iphone("Iphone10", "Black", 999);
 //       wykonane bez użycia klasy Object - działa
        if (iphone1.model.equals(iphone2.model) && (iphone1.color.equals(iphone2.color)) && iphone1.cena == iphone2.cena){
            System.out.println("To ten sam iPhone");
    }
        else {
            System.out.println("To inny iphone");
        }
    }
}
