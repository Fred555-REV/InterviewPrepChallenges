package com.challenges.solutions.carinheritance;

public class InnovaCrysta extends Car {
    int mileage;

    public InnovaCrysta(int mileage) {
        super(false,6);
        this.mileage = mileage;
    }

    @Override
    String getMileage() {
        return mileage + " kmpl";
    }
}
