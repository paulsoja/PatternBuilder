package com.patternbuilder.p_sha.patternbuilder.builder;

import com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype.fooditems.ChickenBurger;
import com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype.fooditems.Coke;
import com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype.fooditems.Pepsi;
import com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype.fooditems.VegBurger;
import com.patternbuilder.p_sha.patternbuilder.logic.Meal;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
