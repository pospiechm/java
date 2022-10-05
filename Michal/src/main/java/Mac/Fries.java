package Mac;

public class Fries extends Meal{

        private FriesSize friesSize;

        public Fries(MealType mealType, int mealPrice, int mealCalories, FriesSize friesSize) {
            super(mealType,mealPrice,mealCalories);
            this.friesSize = friesSize;
        }


        public enum FriesSize{
            SMALL,MEDIUM,LARGE;
        }

    @Override
    public String toString() {
        return "Fries{" +
                "friesSize=" + friesSize +
                '}';
    }
}


