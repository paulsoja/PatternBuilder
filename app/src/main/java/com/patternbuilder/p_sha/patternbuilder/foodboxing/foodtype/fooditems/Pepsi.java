package com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype.fooditems;

import com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype.ColdDrink;

public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }

}
