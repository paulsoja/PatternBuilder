package com.patternbuilder.p_sha.patternbuilder.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.patternbuilder.p_sha.patternbuilder.R;
import com.patternbuilder.p_sha.patternbuilder.builder.MealBuilder;
import com.patternbuilder.p_sha.patternbuilder.logic.Meal;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView vegCostTV;
    private TextView nonVegCostTV;
    private RecyclerView rvVeg, rvNonVeg;
    MealBuilder mealBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vegCostTV = findViewById(R.id.veg_cost);
        nonVegCostTV = findViewById(R.id.non_veg_cost);
        rvVeg = findViewById(R.id.recycler_veg);
        rvNonVeg = findViewById(R.id.recycler_nonveg);
        mealBuilder = new MealBuilder();
        fillData();
    }

    private void fillData() {
        fillVeg();
        fillNonVeg();
    }

    private void fillNonVeg() {
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegCostTV.setText("Total cost: " + nonVegMeal.getCost());
        rvNonVeg.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvNonVeg.setLayoutManager(linearLayoutManager);
        List<ItemFood> list = new ArrayList<>();
        nonVegMeal.showList(list);
        FoodAdapter adapter = new FoodAdapter(list);
        rvNonVeg.setAdapter(adapter);
    }

    private void fillVeg() {
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegCostTV.setText("Total cost: " + vegMeal.getCost());
        rvVeg.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvVeg.setLayoutManager(linearLayoutManager);
        List<ItemFood> list = new ArrayList<>();
        vegMeal.showList(list);
        FoodAdapter adapter = new FoodAdapter(list);
        rvVeg.setAdapter(adapter);
    }

}
