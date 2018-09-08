package com.patternbuilder.p_sha.patternbuilder.foodboxing.foodtype;

import com.patternbuilder.p_sha.patternbuilder.core.Item;
import com.patternbuilder.p_sha.patternbuilder.core.Packing;
import com.patternbuilder.p_sha.patternbuilder.foodboxing.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
