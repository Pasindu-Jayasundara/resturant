package com.tec.resturant.controller;

import com.tec.resturant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("restaurantList",restaurantService.getAllRestaurant());
        return "index";
    }

    @GetMapping("/delete")
    public String deleteRestuarant(@RequestParam int id){
        restaurantService.deleteRestaurantById(id);
        return "redirect:/";
    }

}
