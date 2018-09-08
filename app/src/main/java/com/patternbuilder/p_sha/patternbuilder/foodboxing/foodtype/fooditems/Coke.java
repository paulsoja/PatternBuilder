package com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype.fooditems;

import com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype.ColdDrink;

public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }

}
