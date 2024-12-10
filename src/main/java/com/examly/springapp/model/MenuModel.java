package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class MenuModel {
	
	@TableGenerator(name = "auto_generator",initialValue = 1000)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "auto_generator")
	private Integer foodMenuID;
	
	private String foodMenuImage;
	private String foodMenuItems;
	private String foodMenuType;
	private Integer foodMenuCost;
	
	public Integer getFoodMenuID() {
		return foodMenuID;
	}
	public void setFoodMenuID(Integer foodMenuID) {
		this.foodMenuID = foodMenuID;
	}
	public String getfoodMenuImage() {
		return foodMenuImage;
	}
	public void setfoodMenuImage(String foodMenuImage) {
		this.foodMenuImage = foodMenuImage;
	}
	public String getFoodMenuItems() {
		return foodMenuItems;
	}
	public void setFoodMenuItems(String foodMenuItems) {
		this.foodMenuItems = foodMenuItems;
	}
	public String getFoodMenuType() {
		return foodMenuType;
	}
	public void setFoodMenuType(String foodMenuType) {
		this.foodMenuType = foodMenuType;
	}
	public Integer getFoodMenuCost() {
		return foodMenuCost;
	}
	public void setFoodMenuCost(Integer foodMenuCost) {
		this.foodMenuCost = foodMenuCost;
	}
}
