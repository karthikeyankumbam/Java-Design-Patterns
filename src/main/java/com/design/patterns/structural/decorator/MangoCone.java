package com.design.patterns.structural.decorator;

public class MangoCone implements Ingredient {
    @Override
    public double getCost() {
        return 25;
    }

    @Override
    public String getDescription() {
        return "Mango Cone ";
    }
}
