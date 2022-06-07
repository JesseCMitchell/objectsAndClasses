class Car {
    public int year;
    public String make;
    public String model;
    public String color;
}


public class CarTest {
    public static void main(String[] args) {
        // Create a new car and assign it some values
        Car client1Car = new Car();
        client1Car.year = 2001;
        client1Car.make = "Honda";
        client1Car.model = "Civic";
        client1Car.color = "white";

        // Create another new car and assign it some values
        Car client2Car = new Car();
        client2Car.year = 2022;
        client2Car.make = "Atlas";
        client2Car.model = "Volkswagen";
        client2Car.color = "blue";

        // Now they have their own individual data stored together.
        System.out.println("Car 1 make: " + client1Car.make);
        System.out.println("Car 1 model: " + client1Car.model);

        System.out.println("Car 2 make: " + client2Car.make);
        System.out.println("Car 2 model: " + client2Car.model);
    }
}
