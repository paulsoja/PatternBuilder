package com.patternbuilder.p_sha.patternbuilder.logic;

import android.widget.TextView;

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

    public void showItems(TextView textView) {
        //TODO вместо textview сделать listview, чтобы выводило все элементы, а не только последний
        for (Item item : list) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
            textView.setText("Item : " + item.name()
                    + ", Packing : " + item.packing().pack()
                    + ", Price : " + item.price());
        }
    }

}
