package com.examly.springapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.*;
import com.examly.springapp.repository.*;

@Service
public class FoodmenuService {
	
	@Autowired
	private FoodmenuRepository foodmenurepository;	
	
	public MenuModel addMenu(MenuModel foodmenu)
	{
		return foodmenurepository.save(foodmenu);
	}
	
	public List<MenuModel> getMenu()
	{
		return (List<MenuModel>) foodmenurepository.findAll();
	}
	
	public void deleteMenu(Integer foodMenuID)
	{
		foodmenurepository.deleteById(foodMenuID);
	}
	public Optional<MenuModel> getitem(Integer foodMenuID)
	{
		return foodmenurepository.findById(foodMenuID);
	}
	public MenuModel editMenu(MenuModel foodmenu)
	{
		Integer foodMenuID=foodmenu.getFoodMenuID();
		MenuModel item=foodmenurepository.findById(foodMenuID).get();
		item.setfoodMenuImage(foodmenu.getfoodMenuImage());
		item.setFoodMenuItems(foodmenu.getFoodMenuItems());
		item.setFoodMenuType(foodmenu.getFoodMenuType());
		item.setFoodMenuCost(foodmenu.getFoodMenuCost());
		return foodmenurepository.save(item);
	}
}

