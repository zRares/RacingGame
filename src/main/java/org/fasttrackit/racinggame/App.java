package org.fasttrackit.racinggame;


import org.fasttrackit.racinggame.Car;

public class App {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.manufacturer = "Bavaria.Motors";
        engine.cubicCentimeters = 3000;

        Car car = new Car(engine);
        car.setName("BMW");
        car.setColor("grey");
        car.doorCount = 4;
        car.setMaxSpeed(240);
        car.setMileage(5);
        car.setRunning(true);

//        double distance - stores the result in the variable "distance"
        double distance = car.accelerate(60, 1);



        car.engine = engine;

        System.out.println("Engine details: " + car.engine.manufacturer);

        engine.manufacturer = "VW";

        System.out.println("Engine details2: " + car.engine.manufacturer);

        car.engine.manufacturer = "Audi";

        System.out.println("Engine details3: " + car.engine.manufacturer);

        System.out.println("Engine: " + engine.manufacturer);


        System.out.println("Car1: " + car.getName());

        Car car2 = new Car(new Engine());
        car2.setName("KIA");

        System.out.println("Car2: " + car2.getName());
        System.out.println(car2.getColor());
        System.out.println(car2.doorCount);
        System.out.println(car2.isRunning());
    }
}
