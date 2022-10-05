package powtorka;

public class CarManger {
    public static void main(String[] args) {
        Car car = new Car("Ford", 2020);
        car.setRocznik(-100);
        System.out.println(car);
    }
}
