package com.example.Where.to.Eat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/api/restaurante")
    class RestaurantController {

        @Autowired
        private RestaurantRepository restaurantRepository;

        @GetMapping
        public List<Restaurant> getAllRestaurante() {
            return restaurantRepository.findAll();
        }
    }
