package com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype.fooditems;

import com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype.Burger;

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }

}
