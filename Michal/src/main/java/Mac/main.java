package Mac;

import Karolina.brudnopis.Wzorce.Database.Database;

public class main {
    public static void main(String[] args) {
        Order order = new Order();

        // Burger atrybuty MealType mealType, int mealPrice, int mealCalories,Size size, Roll roll

        Burger singleBurgerLightRoll = new Burger(Meal.MealType.BURGER, 10,300, Burger.Size.SINGLE, Burger.Roll.LIGHT);
        Burger doubleBurgerLightRoll = new Burger(Meal.MealType.BURGER, 15,450, Burger.Size.DOUBLE, Burger.Roll.LIGHT);
        Burger singleBurgerDarkRoll = new Burger(Meal.MealType.BURGER, 10,320, Burger.Size.SINGLE, Burger.Roll.DARK);
        Burger doubleBurgerDarkRoll = new Burger(Meal.MealType.BURGER, 15,470, Burger.Size.DOUBLE, Burger.Roll.DARK);
        Fries smallFries = new Fries(Meal.MealType.FRIES,8, 200, Fries.FriesSize.SMALL);
        Fries mediumFries = new Fries(Meal.MealType.FRIES,12, 300, Fries.FriesSize.MEDIUM);
        Fries largeFries = new Fries(Meal.MealType.FRIES,16, 400, Fries.FriesSize.LARGE);

        order.addBurgerToList(singleBurgerDarkRoll);
        order.addBurgerToList(singleBurgerDarkRoll);
        order.addFriesToList(largeFries);
        order.addBurgerToList(mediumFries);

        order.showOrder();
        System.out.println("Wartość zamówienia: " + order.showOrderValue());;
    }
}
