package Mac;

import Karolina.brudnopis.Wzorce.Kompozyt.Employee;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private MealType mealType;
    private int mealPrice;
    private int mealCalories;

    public enum MealType {BURGER,FRIES,SALAD,DRINK}

    public Meal(MealType mealType, int mealPrice, int mealCalories) {
        this.mealType = mealType;
        this.mealPrice = mealPrice;
        this.mealCalories = mealCalories;
    }



    public MealType getMealType() {
        return mealType;
    }


    public int getMealPrice() {
        return mealPrice;
    }

    public int getMealCalories() {
        return mealCalories;
    }

    private static List<Meal> meal = new ArrayList<>();
}
