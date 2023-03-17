package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    // "has-a" relationship (aggregation)
    Engine engine;

    public AutoVehicle(Engine engine, String name, double maxSpeed) {
        super(name, maxSpeed);
        this.engine = engine;
    }
}
