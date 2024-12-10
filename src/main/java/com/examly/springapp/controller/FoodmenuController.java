package com.examly.springapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.*;
import com.examly.springapp.service.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.context.annotation.Configuration;
@CrossOrigin(origins = "http://localhost:4200")
@Configuration
@RestController

@RequestMapping("/admin")
public class FoodmenuController {

	@Autowired
	private FoodmenuService foodmenuservice;
	
	@PostMapping("/addMenu")
	public MenuModel addMenu(@RequestBody MenuModel foodmenu)
	{
		return foodmenuservice.addMenu(foodmenu);
	}
	
	@GetMapping("/getMenu")
	public List<MenuModel> getMenu()
	{
		return foodmenuservice.getMenu();
	}
	
	@RequestMapping(value = "/deleteMenu/{id}", method = RequestMethod.DELETE)
	public void deleteMenu(@PathVariable Integer id) {
		foodmenuservice.deleteMenu(id);
	 }
	
	@GetMapping("/getitembyid")
	public Optional<MenuModel> getitem(@RequestParam Integer foodMenuID)
	{
			return foodmenuservice.getitem(foodMenuID);
	}
	@PutMapping("/editMenu")
	public MenuModel editMenu(@RequestBody MenuModel foodmenu)
	{
		return foodmenuservice.editMenu(foodmenu);
	}
}

