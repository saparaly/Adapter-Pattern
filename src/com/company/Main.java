package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Driving driving = new Driving();
        driving.addCar(new Tesla());
        driving.addCar(new Kia());

        System.out.println("Driving...");
        driving.drive();
        System.out.println("Calculating cost...");
        driving.cost();
    }
}
