import java.util.HashMap;
import java.util.Map;

public class CarShowroom {

    Map<String, Car> currentCars = new HashMap<>();

    public CarShowroom() {
        initialiseShowroom();
    }

    void initialiseShowroom(){
        currentCars.put("Aston Martin", new Car("Aston Martin", 50000, 2012));
        currentCars.put("BMW", new Car("BMW", 30000, 2014));
        currentCars.put("Chevrolet", new Car("Chevrolet", 20000, 2013));
        currentCars.put("Datsun", new Car("Datsun", 2000, 2001));
    }

    public static void main(String[] args) {
        CarShowroom showroom = new CarShowroom();
    }


}
