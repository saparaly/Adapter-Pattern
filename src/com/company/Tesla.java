package com.company;

public class Tesla implements Car{

    @Override
    public void drive() {
        System.out.println("Tesla Driving");
    }

    @Override
    public void cost() {
        System.out.println("Calculating cost of Tesla");
    }

    @Override
    public String description() {
        return "Tesla";
    }
}
