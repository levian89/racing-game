package org.fasttrackit;

// "is-a" relationship (inheritance)
public class Car extends AutoVehicle {


    int doorCount;

    public Car(Engine engine, String name, double maxSpeed) {
        super(engine, name, maxSpeed);
    }
}
