package org.fasttrackit;

public class App 
{
    public static void main( String[] args )
    {

        Game game = new Game();
        game.start();


//        System.out.println("Hello World!");
//
//        Engine autoVehicleEngine = new Engine();
//        autoVehicleEngine.manufacturer = "VW";
//
//        AutoVehicle autoVehicle = new AutoVehicle(autoVehicleEngine, "VW", 300);
//
//        Engine engine1 = new Engine();
//        engine1.manufacturer = "Ferrari";
//        engine1.capacity = 3000;
//
//        Car carReference = new Car(engine1,"Ferrari", 300);
//        carReference.name = "Ferrari";
//        carReference.maxSpeed = 300;
//        carReference.fuelLevel = 60;
//        carReference.mileage = 12.5;
//        carReference.totalTraveledDistance = 0;
//        carReference.damaged = false;
//        carReference.doorCount = 1;
//        carReference.color = "Red";
//
//
//        System.out.println("engine capacity: " + engine1.capacity);
//        System.out.println("Car engine capacity: " + carReference.engine.capacity);
//
//        engine1.capacity = 4000;
//        System.out.println("Car engine capacity after update: " + carReference.engine.capacity);
//
//
//        // concatenation
//        System.out.println("Properties of car " + carReference.name);
//        System.out.println("Max speed: " + carReference.maxSpeed);
//        System.out.println("Fuel level: " + carReference.fuelLevel);
//        System.out.println("Mileage: " + carReference.mileage);
//        System.out.println("Total Traveled Distance " + carReference.totalTraveledDistance);
//        System.out.println("Damaged: " + carReference.damaged);
//        System.out.println("Door Count " + carReference.doorCount);
//        System.out.println("Color " + carReference.color);
//        System.out.println(carReference);
//
//
//        Car car2 = new Car(new Engine(), "Renault", 300);
//        car2.name = "Renault";
//        car2.fuelLevel = 70;
//        car2.maxSpeed = 200;
//        car2.mileage = 10;
//        car2.totalTraveledDistance = 100;
//
//        car2.engine.capacity = 2000;
//
//        System.out.println("Properties of car " + car2.name);
//        System.out.println("Max speed: " + car2.maxSpeed);
//        System.out.println("Fuel level: " + car2.fuelLevel);
//        System.out.println("Mileage: " + car2.mileage);
//        System.out.println("Total Traveled Distance " + car2.totalTraveledDistance);
//        System.out.println("Damaged: " + car2.damaged);
//        System.out.println("Door Count " + car2.doorCount);
//        System.out.println("Color " + car2.color);
//
//        System.out.println("**********");
//
//        double distanceForCar1 = carReference.accelerate(100,1);
//        System.out.println(carReference.totalTraveledDistance);
//
//        double distanceForCar2 = car2.accelerate(130,1);
//        System.out.println(car2.totalTraveledDistance);
//
//        System.out.println("Engine manufacturer before repair: " + carReference.engine.manufacturer);
//        Mechanic mechanic = new Mechanic();
//        mechanic.repair(carReference);
//        System.out.println("Engine manufacturer after repair: " + carReference.engine.manufacturer);




//        System.out.println("Initial name for car1: " + carReference.name);
//        carReference.name = "Audi";
//        System.out.println("Changed name for car1: " + carReference.name);
//
//        carReference = new Car();
//        System.out.println("Name of new car: " + carReference.name);
//        carReference.name = "BMW";
//        System.out.println("Name of new car: " + carReference.name);
//
//        carReference = car2;  // am in memorie un singur obiect cu 2 referinte catre el
//        System.out.println("Name of car referenced from 2 variables. carReference: " + carReference.name);
//        System.out.println("Name of car referenced from 2 variables. car2: " + car2.name);
//
//
//        car2.name = "Dacia";
//        System.out.println("Updated name of car referenced from 2 variables. carReference: " + carReference.name);
//        System.out.println("Updated name of car referenced from 2 variables. car2: " + car2.name);
//
//        carReference.name = "Ford";
//        System.out.println("Updated again name of car referenced from 2 variables. carReference: " + carReference.name);
//        System.out.println("Updated again name of car referenced from 2 variables. car2: " + car2.name);
//
//        car2 = null;
//        // System.out.println(car2.name); --> will generate NullPointerException
//
//        System.out.println(carReference.name);

//        System.out.println("Modulo operator example: ");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//
//        if (4 % 2 == 0) {
//            System.out.println("4 is an even number.");
//        }


    }
}
