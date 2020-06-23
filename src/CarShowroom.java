import java.util.HashMap;
import java.util.Map;

public class CarShowroom {

    private Map<String, Car> currentCars = new HashMap<>();
    private int averageCarPrice;


    public CarShowroom() {
        initialiseShowroom();
        calculateAveragePrice();
        getOldestCar();
        getPriciestCar();
    }

    //First populate hashmap with initial cars in the showroom
    void initialiseShowroom(){
        currentCars.put("Aston Martin", new Car("Aston Martin", 50000, 2012));
        currentCars.put("BMW", new Car("BMW", 30000, 2014));
        currentCars.put("Chevrolet", new Car("Chevrolet", 20000, 2013));
        currentCars.put("Datsun", new Car("Datsun", 2000, 2001));
    }

    void calculateAveragePrice(){
        int totalPrice = 0;

        for (Map.Entry<String, Car> car: currentCars.entrySet()
             ) {
            totalPrice += car.getValue().getPrice();
        }

        averageCarPrice =  totalPrice / currentCars.size();
    }

    void getOldestCar(){

    }

    void getPriciestCar(){

    }

    public static void main(String[] args) {
        CarShowroom showroom = new CarShowroom();

        showroom.currentCars.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
