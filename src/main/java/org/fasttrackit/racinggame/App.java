package org.fasttrackit.racinggame;


import org.fasttrackit.racinggame.Car;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "BMW";
        car.color = "grey";
        car.doorCount = 4;
        car.maxSpeed = 240;
        car.mileage = 10.5;
        car.running = true;

//        double distance - stores the result in the variable "distance"
        double distance = car.accelerate(60, 1);

        Engine engine = new Engine();
        engine.manufacturer = "Bavaria.Motors";
        engine.cubicCentimeters = 3000;

        car.engine = engine;

        System.out.println("Engine details: " + car.engine.manufacturer);

        engine.manufacturer = "VW";

        System.out.println("Engine details2: " + car.engine.manufacturer);

        car.engine.manufacturer = "Audi";

        System.out.println("Engine details3: " + car.engine.manufacturer);

        System.out.println("Engine: " + engine.manufacturer);


        System.out.println("Car1: " + car.name);

        Car car2 = new Car();
        car2.name = "KIA";

        System.out.println("Car2: " + car2.name);
        System.out.println(car2.color);
        System.out.println(car2.doorCount);
        System.out.println(car2.running);
    }
}
