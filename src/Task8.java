public class Task8 {
    /*
    Create a Class Car that would have the following fields: carPrice and
    color and method calculateSalePrice() which should be returning a
    price of the car.Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own
    implementation of calculateSalePrice() method in which returned price is calculated as following: if weight>2000 then
    returned price car should include 10% discount, otherwise 20% discount. The Sedan class has field as length and also does its own
    implementation of calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5%
    discount, otherwise 10% discount.
     */

    private double carPrice;
    private String color;

    public Task8(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
}

class Sedan extends Task8 {
    private double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            return super.calculateSalePrice() * 0.95; // 5% discount
        } else {
            return super.calculateSalePrice() * 0.9; // 10% discount
        }
    }
}
class Truck extends Task8 {
    private double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return super.calculateSalePrice() * 0.9; // 10% discount
        } else {
            return super.calculateSalePrice() * 0.8; // 20% discount
        }
    }
}
class CarTest {
    public static void main(String[] args) {
        Task8 sedan = new Sedan(30000, "Black", 20);
        System.out.println("Sedan Sale Price: $" + sedan.calculateSalePrice());

        Task8 truck = new Truck(60000, "White", 2700);
        System.out.println("Truck Sale Price: $" + truck.calculateSalePrice());
    }
}
