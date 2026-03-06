package com.tec.resturant.controller;

import com.tec.resturant.model.Restaurant;
import com.tec.resturant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/edit")
    public String showEditForm(@RequestParam int id,Model model){
        model.addAttribute("restaurant",restaurantService.getRestaurantById(id));
        return "edit_restaurant";
    }

    @PostMapping("/save-edit")
    public String updateResturant(@ModelAttribute Restaurant restaurant){
        restaurantService.updateRestaurant(restaurant);
        return "redirect:/";
    }

    @GetMapping("/new")
    public String showNewForm(Model model){
        model.addAttribute("restaurant",new Restaurant());
        return "new_restaurant";
    }

    @PostMapping("/save-new")
    public String addNewRestaurant(@ModelAttribute("restaurant") Restaurant restaurant){
        restaurantService.saveRestaurant(restaurant);
        return "redirect:/";
    }

}
