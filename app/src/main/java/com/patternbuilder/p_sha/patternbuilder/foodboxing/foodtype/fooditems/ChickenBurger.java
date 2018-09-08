package com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype.fooditems;

import com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype.Burger;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }

}
