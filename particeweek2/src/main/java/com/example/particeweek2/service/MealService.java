package com.example.particeweek2.service;


import com.example.particeweek2.model.Meal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MealService {
    List<Meal> mealList=new ArrayList<>();
    public MealService(){
        Meal meal = new Meal("Hamburger", 120,"Taste good" );
        this.mealList.add(meal);
    }

    public Meal getMealByName(String name) {
        for (int i = 0; i < this.mealList.size(); i++) {
            if (this.mealList.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                return this.mealList.get(i);
            }
        }
        return null;


    }
}

