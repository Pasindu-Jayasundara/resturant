package com.tec.resturant.service;

import com.tec.resturant.model.Restaurant;
import com.tec.resturant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> getAllRestaurant(){
        return restaurantRepository.findAll();
    }

    public Restaurant getRestaurantById(int id){
        return restaurantRepository.findById(id).orElse(null);
    }

    public void deleteRestaurantById(int id){
        restaurantRepository.deleteById(id);
    }

    public void saveRestaurant(Restaurant restaurant){
        restaurantRepository.save(restaurant);
    }

    public void updateRestaurant(Restaurant restaurant){
        restaurantRepository.save(restaurant);
    }
}
