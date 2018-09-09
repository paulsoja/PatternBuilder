package com.patternbuilder.p_sha.patternbuilder.ui;

public class ItemFood {

    private String item;
    private String packing;
    private float cost;

    public ItemFood(String item, String packing, float cost) {
        this.item = item;
        this.packing = packing;
        this.cost = cost;
    }

    public String getItem() {
        return item;
    }

    public String getPacking() {
        return packing;
    }

    public float getCost() {
        return cost;
    }

}
