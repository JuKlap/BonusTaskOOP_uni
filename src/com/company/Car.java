package com.company;

public class Car {

    private int fuelEfficiency;
    private int fuelInTheTank = 0;
    private int distance;

    public Car() {} // default constructor

    public Car(int newFuelEfficiency) {
        if (fuelEfficiency < 0) {
            System.out.println("Value is invalid");
        }
        fuelEfficiency = newFuelEfficiency;
    }

    public void setFuelEfficiency(int fuelEfficiency){
        this.fuelEfficiency = fuelEfficiency;
    }

    public void setFuelInTheTank(int fuelInTheTank){
        this.fuelInTheTank = fuelInTheTank;
    }

    public int getFuelEfficiency(int fuelEfficiency){
        return this.fuelEfficiency;
    }

    public int getFuelInTheTank(int fuelInTheTank){
        return this.fuelInTheTank;
    }

    public void addFuel(int newFuelInTheTank){
        if (newFuelInTheTank <= 0){
            System.out.println("Value is invalid");
        }
        fuelInTheTank = newFuelInTheTank;
    }

    public int getFuelLevel() {
        if (fuelInTheTank <= 0) {
            System.out.println("Value is invalid");
        }
        return (((fuelInTheTank - (distance / fuelEfficiency)) * 100) / 100);
    }

    public void drive(int newDistance) {
        if (newDistance < 0) {
            System.out.println("Value is invalid");
        }
        distance = newDistance;
    }


}
