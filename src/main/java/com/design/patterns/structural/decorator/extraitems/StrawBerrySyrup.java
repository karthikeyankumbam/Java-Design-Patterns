package com.design.patterns.structural.decorator.extraitems;

import com.design.patterns.structural.decorator.Ingredient;
import com.design.patterns.structural.decorator.IngredientsDecorator;

public class StrawBerrySyrup extends IngredientsDecorator {
    public StrawBerrySyrup(Ingredient baseIngredient) {
        super(baseIngredient);
    }

    @Override
    public double getCost() {
        return 40+baseIngredient.getCost();
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription()+"Straw Berry Syrup";
    }
}
