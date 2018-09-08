package com.patternbuilder.p_sha.patternbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.patternbuilder.p_sha.patternbuilder.builder.MealBuilder;
import com.patternbuilder.p_sha.patternbuilder.logic.Meal;

public class MainActivity extends AppCompatActivity {

    private TextView vegMenuTV, vegMealTV, vegCostTV;
    private TextView nonVegMenuTV, nonVegMealTV, nonVegCostTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vegMenuTV = findViewById(R.id.veg_menu);
        vegMealTV = findViewById(R.id.veg_meal);
        vegCostTV = findViewById(R.id.veg_cost);
        nonVegMenuTV = findViewById(R.id.non_veg_menu);
        nonVegMealTV = findViewById(R.id.non_veg_meal);
        nonVegCostTV = findViewById(R.id.non_veg_cost);
        fillData();
    }

    private void fillData() {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        //vegMealTV.setText("Veg meal");
        vegMeal.showItems(vegMealTV);
        vegCostTV.setText("Total cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        //nonVegMealTV.setText("Non veg meal");
        nonVegMeal.showItems(nonVegMealTV);
        nonVegCostTV.setText("Total cost: " + nonVegMeal.getCost());
    }

}
