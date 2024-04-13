package com.design.patterns.creational.factory.products;

public class AndroidMenu implements Menu{
    @Override
    public void render() {
        System.out.println("Rendering Android menu");
    }
}
