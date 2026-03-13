package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Restaurant;
import com.klef.fsad.exam.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/add")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant)
    {
        return restaurantService.addRestaurant(restaurant);
    }

    @GetMapping("/viewall")
    public List<Restaurant> viewAllRestaurants()
    {
        return restaurantService.getAllRestaurants();
    }
}