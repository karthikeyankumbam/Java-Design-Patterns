package com.design.patterns.structural.decorator.extraitems;

import com.design.patterns.structural.decorator.Ingredient;
import com.design.patterns.structural.decorator.IngredientsDecorator;

public class ChocoChip extends IngredientsDecorator {

    public ChocoChip(Ingredient baseIngredient) {
        super(baseIngredient);
    }

    @Override
    public double getCost() {
        return 10+baseIngredient.getCost();
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription()+"Choco chip";
    }
}
