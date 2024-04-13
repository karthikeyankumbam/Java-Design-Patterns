package com.design.patterns.creational.factory.products;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("Clicking Android Button");
    }
}
