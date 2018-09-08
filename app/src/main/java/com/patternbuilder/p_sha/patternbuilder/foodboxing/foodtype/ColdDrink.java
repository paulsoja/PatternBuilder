package com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype;

import com.patternbuilder.p_sha.patternbuilder.foodboxing.Bottle;
import com.patternbuilder.p_sha.patternbuilder.core.Item;
import com.patternbuilder.p_sha.patternbuilder.core.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
