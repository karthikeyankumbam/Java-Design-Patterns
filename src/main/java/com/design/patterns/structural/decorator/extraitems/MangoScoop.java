package com.design.patterns.structural.decorator.extraitems;

import com.design.patterns.structural.decorator.Ingredient;
import com.design.patterns.structural.decorator.IngredientsDecorator;

public class MangoScoop extends IngredientsDecorator {
    public MangoScoop(Ingredient baseIngredient) {
        super(baseIngredient);
    }

    @Override
    public double getCost() {
        return 5+baseIngredient.getCost();
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription()+"Mango scoop";
    }
}
