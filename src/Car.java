public class Car {

    String make;
    int price;
    int year;

    public Car(String make, int price, int year) {
        this.make = make;
        this.price = price;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
