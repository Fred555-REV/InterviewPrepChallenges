package com.challenges.solutions.carinheritance;

public class WagonR extends Car{
    int mileage;
    public WagonR(int mileage) {
        super(false,4);
        this.mileage=mileage;
    }

    @Override
    String getMileage() {
        return mileage + " kmpl";
    }
}
