import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarShowroom {

    private Map<String, Car> currentCars = new HashMap<>();
    private int averageCarPrice;
    private Car oldestCar;
    private Car priciestCar;


    public CarShowroom() {
        initialiseShowroom();
        calculateAveragePrice();
        setOldestCar();
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

    void setOldestCar(){

        Car oldestCarCurrently = null;
        Car currentCar;

        for (Map.Entry<String, Car> car: currentCars.entrySet()
        ) {
            currentCar = car.getValue();

            if (oldestCarCurrently == null ||  currentCar.getYear() < oldestCarCurrently.getYear()){
                oldestCarCurrently = currentCar;
            }
        }

        oldestCar = oldestCarCurrently;
    }

    void getPriciestCar(){

        Car priciestCarCurrently = null;
        Car currentCar;

        for (Map.Entry<String, Car> car: currentCars.entrySet()
        ) {
            currentCar = car.getValue();

            if (priciestCarCurrently == null ||  currentCar.getPrice() > priciestCarCurrently.getPrice()){
                priciestCarCurrently = currentCar;
            }
        }

        priciestCar = priciestCarCurrently;

    }

    public static void main(String[] args) {
        CarShowroom showroom = new CarShowroom();
        int input;
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the car showroom, to list all cars in the showroom press 1:");

        while(true){

            input = Integer.parseInt(in.nextLine());

            if (input == 1){
                showroom.currentCars.entrySet().forEach(entry->{
                    System.out.println("Model: "+ entry.getKey() + "\nPrice: " + entry.getValue().getPrice() + "\nYear: " + entry.getValue().getYear() + "\n");
                });
            }
        }


    }
}
