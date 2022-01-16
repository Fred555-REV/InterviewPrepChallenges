package com.challenges.solutions.carinheritance;

public class HondaCity extends Car {
    int mileage;

    public HondaCity(int mileage) {
        super(true, 4);
        this.mileage = mileage;
    }

    @Override
    String getMileage() {
        return mileage + " kmpl";
    }
}
