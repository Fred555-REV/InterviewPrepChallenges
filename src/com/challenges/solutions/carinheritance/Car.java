package com.challenges.solutions.carinheritance;

public abstract class Car {
    Boolean isSedan;
    int seats;

    public Car(Boolean isSedan, int seats) {
        this.isSedan = isSedan;
        this.seats = seats;
    }

    public boolean getIsSedan() {
        return isSedan;
    }

    public int getSeats() {
        return seats;
    }

    abstract String getMileage();

    @Override
    public String toString() {
        return "Car{" +
                "isSedan=" + isSedan +
                ", seats=" + seats +
                '}';
    }
}
