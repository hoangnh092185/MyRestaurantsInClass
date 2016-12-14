package com.epicodus.myrestaurantsclass.util;

import com.epicodus.myrestaurantsclass.models.Restaurant;

import java.util.ArrayList;

/**
 * Created by Guest on 12/14/16.
 */
public interface OnRestaurantSelectedListener {
    public void onRestaurantSelected(Integer position, ArrayList<Restaurant> restaurants);
}
