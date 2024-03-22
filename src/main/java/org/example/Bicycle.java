package org.example;
class Bicycle extends CarbonFootprint {
    private double usageFrequency;

    public Bicycle(double uf) {
        usageFrequency = uf;
    }

    @Override
    public double getCarbonFootprint() {
        return usageFrequency * 0.02;
    }
}


