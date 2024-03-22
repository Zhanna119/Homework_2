package org.example;

class Car extends CarbonFootprint {
    private double mileage;
    private double fuelEfficiency;

    public Car(double m, double fe) {
        mileage = m;
        fuelEfficiency = fe;
    }

    @Override
    public double getCarbonFootprint() {
        return mileage / fuelEfficiency * 2.3;
    }
}




