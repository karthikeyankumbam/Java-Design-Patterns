package com.design.patterns.structural.decorator;

public abstract class IngredientsDecorator implements Ingredient{
    public Ingredient baseIngredient;
    public IngredientsDecorator(Ingredient baseIngredient) {
        this.baseIngredient = baseIngredient;
    }
}
