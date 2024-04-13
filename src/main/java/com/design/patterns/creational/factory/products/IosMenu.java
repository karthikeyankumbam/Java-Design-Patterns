package com.design.patterns.creational.factory.products;

public class IosMenu implements Menu{
    @Override
    public void render() {
        System.out.println("Rendering IOS menu");
    }
}
