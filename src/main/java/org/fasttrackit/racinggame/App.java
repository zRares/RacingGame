package org.fasttrackit.racinggame;


import org.fasttrackit.racinggame.Car;

import javax.swing.undo.AbstractUndoableEdit;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();

//        Engine engine = new Engine();
//        engine.manufacturer = "Bavaria.Motors";
//        engine.cubicCentimeters = 3000;
//
//        Car car = new Car(engine);
//        car.setName("BMW");
//        car.setColor("grey");
//        car.doorCount = 4;
//        car.setMaxSpeed(240);
//        car.setMileage(5);
//        car.setRunning(true);
//
//        System.out.println(car);
//
////        double distance - stores the result in the variable "distance"
//        double distance = car.accelerate(60);
//
//
//
//        car.engine = engine;
//
//        System.out.println("Engine details: " + car.engine.manufacturer);
//
//        engine.manufacturer = "VW";
//
//        System.out.println("Engine details2: " + car.engine.manufacturer);
//
//        car.engine.manufacturer = "Audi";
//
//        System.out.println("Engine details3: " + car.engine.manufacturer);
//
//        System.out.println("Engine: " + engine.manufacturer);
//
//
//        System.out.println("Car1: " + car.getName());
//
//        Car car2 = new Car(new Engine());
//        car2.setName("KIA");
//
//        System.out.println("Car2: " + car2.getName());
//        System.out.println(car2.getColor());
//        System.out.println(car2.doorCount);
//        System.out.println(car2.isRunning());

//        System.out.println("Static variables demo: ");
//
//        car.totalVehicleCount = 10;
//
//        System.out.println("Value from car: " + car.totalVehicleCount);
//
//        car2.totalVehicleCount = 20;
//
//        System.out.println("Value from car: " + car.totalVehicleCount);
//        System.out.println("Value from car2: " + car2.totalVehicleCount);

//        System.out.println("Total Vehicle Count: " + Vehicle.getTotalVehicleCount());


        //method implementation taken from object type

//        Vehicle cheater = new Cheater();
//        cheater.accelerate(60, 1);

        // exposed methods taken from variable type, not from object type
        // cheater.win();

        // type casting
//        ((Cheater) cheater).win();
//
//        Mechanic mechanic = new Mechanic();
//        mechanic.repair(cheater);
//        mechanic.repair(new Car(new Engine()));

    }
}
