package com.challenges.solutions.carinheritance;

public class CarInheritance {
    //      0  WagonR is not sedan and has 4 seats
//      1 HondaCity is a sedan and has 4 seats
//      2 innovaCrysta is not a sedan and has 6 seats
    public static String solution(int carChoice,int mileage) {
        Car car = null;
        StringBuilder output = new StringBuilder();
        output.append("A ");
        switch (carChoice) {
            case 0:
                car = new WagonR(mileage);
                output.append("WagonR");
                break;
            case 1:
                car = new HondaCity(mileage);
                output.append("HondaCity");
                break;
            case 2:
                car = new InnovaCrysta(mileage);
                output.append("InnovaCrysta");
                break;
        }
        output.append(" is ");
        if(car.isSedan){
            output.append(" a sedan");
        }else {
            output.append(" not a sedan");
        }
        output.append(", is a ").append(car.getSeats()).append("-seater,");
        output.append("and has a mileage of around ").append(car.getMileage());
        System.out.println(output);
        return output.toString();
    }
}
