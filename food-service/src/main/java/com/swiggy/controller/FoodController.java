package com.swiggy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/food")
public class FoodController {

  @GetMapping("/search")
  public String searchFood(){
    return "Pizza!!!";
  }

}
