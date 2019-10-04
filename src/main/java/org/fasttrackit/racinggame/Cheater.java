package org.fasttrackit.racinggame;

public class Cheater extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + " is accelerating with : " + speed + " for " + durationInHours + "h.");

        double traveledDistance = speed * durationInHours *2;

        System.out.println("Traveled Distance : " + traveledDistance);

        setTotalTraveledDistance(getTotalTraveledDistance() + traveledDistance);

        System.out.println("Cheater!!");

        return traveledDistance;
    }

    //co-variant return type
    // access to overrriding method can be extended (public here vs protected in super-class)
    @Override
    protected Cheater clone() {
        return new Cheater();
    }

    public void win () {
        System.out.println("I'm gonna win!");

    }
}
