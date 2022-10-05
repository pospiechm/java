package Mac;

public class Burger extends Meal {
    private Size size;
    private Roll roll;

    public Burger(MealType mealType, int mealPrice, int mealCalories,Size size, Roll roll) {
        super(mealType,mealPrice,mealCalories);
        this.size = size;
        this.roll = roll;
    }

    public enum Roll{
        LIGHT, DARK;
    }
    public enum Size{
        SINGLE,DOUBLE;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size=" + size +
                ", roll=" + roll +
                '}';
    }
}
