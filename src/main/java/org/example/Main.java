package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Building building = new Building(2000, 50);
        Car car = new Car(10000, 30);
        Bicycle bicycle = new Bicycle(500);

        List<CarbonFootprint> footprintObjects = new ArrayList<>();

        footprintObjects.add(building);
        footprintObjects.add(car);
        footprintObjects.add(bicycle);

        for (CarbonFootprint obj : footprintObjects) {
            if (obj instanceof Building) {
                System.out.println("Building: Carbon Footprint = " + obj.getCarbonFootprint());
            } else if (obj instanceof Car) {
                System.out.println("Car: Carbon Footprint = " + obj.getCarbonFootprint());
            } else if (obj instanceof Bicycle) {
                System.out.println("Bicycle: Carbon Footprint = " + obj.getCarbonFootprint());
            }
        }
    }
}
