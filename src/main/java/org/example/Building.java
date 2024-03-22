package org.example;

class Building extends CarbonFootprint {
    private double squareFootage;
    private int occupants;

    public Building(double sqft, int occ) {
        squareFootage = sqft;
        occupants = occ;
    }

    @Override
    public double getCarbonFootprint() {
        return squareFootage * occupants * 0.05;
    }
}

