package Mac;

import Karolina.brudnopis.Wzorce.Database.Database;
import Karolina.brudnopis.Wzorce.Kompozyt.Employee;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static List<Meal> order = new ArrayList<>();

    public void addBurgerToList(Meal burger){
        order.add(burger);

    }

    public void addFriesToList(Meal fries){
        order.add(fries);

    }

    public void showOrder() {
        for (Meal m: order
             ) {
            System.out.println(m);
        }

    }

    public int showOrderValue() {
        int sum = 0;
        for (Meal m : order) {
            sum += m.getMealPrice();
        }
        return sum;

    }

}
