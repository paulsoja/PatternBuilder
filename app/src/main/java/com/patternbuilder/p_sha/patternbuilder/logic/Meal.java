package com.patternbuilder.p_sha.patternbuilder.logic;

import com.patternbuilder.p_sha.patternbuilder.ui.ItemFood;
import com.patternbuilder.p_sha.patternbuilder.core.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> list = new ArrayList<>();

    public void addItem(Item item) {
        list.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : list) {
            cost += item.price();
        }
        return cost;
    }

    public void showList(List<ItemFood> listFood) {
        for (int i = 0; i < list.size(); i++) {
            listFood.add(new ItemFood(list.get(i).name(), list.get(i).packing().pack(), list.get(i).price()));
        }
    }

}
