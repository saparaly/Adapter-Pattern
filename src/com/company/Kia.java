package com.company;

public class Kia implements Car{

    @Override
    public void drive() {
        System.out.println("Kia Driving");
    }

    @Override
    public void cost() {
        System.out.println("Calculating cost of Kia");
    }

    @Override
    public String description() {
        return "Kia";
    }
}

