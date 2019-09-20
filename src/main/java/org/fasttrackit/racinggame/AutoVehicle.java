package org.fasttrackit.racinggame;

public class AutoVehicle extends Vehicle {

    //"has-a" relationship
    Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
//        Constructor Overload
    public AutoVehicle() {
        this(new Engine())
//                same effect as calling the other constructor above
//                this.engine = new Engine();


    }
}
