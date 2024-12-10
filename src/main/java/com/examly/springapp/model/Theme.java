package com.examly.springapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="theme")
public class Theme {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int themeId;
	@Column(name="theme_name")
	private String themeName;
	@Column(name="theme_image_url")
	private String themeImageURL;
	@Column(name="theme_description")
	private String themeDescription;
	@Column(name="theme_photographer")
	private String themePhotographer;
	@Column(name="theme_videographer")
	private String themeVideographer;
	@Column(name="theme_return_gift")
	private String themeReturnGift;
	@Column(name="theme_cost")
	private long themeCost;
	public Theme() {
		
	}
	public Theme(String themeName, String themeImageURL, String themeDescription, String themePhotographer,
			String themeVideographer, String themeReturnGift, long themeCost) {
		super();
		this.themeName = themeName;
		this.themeImageURL = themeImageURL;
		this.themeDescription = themeDescription;
		this.themePhotographer = themePhotographer;
		this.themeVideographer = themeVideographer;
		this.themeReturnGift = themeReturnGift;
		this.themeCost = themeCost;
	}
	public int getThemeId() {
		return themeId;
	}
	public void setThemeId(int themeId) {
		this.themeId = themeId;
	}
	public String getThemeName() {
		return themeName;
	}
	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}
	public String getThemeImageURL() {
		return themeImageURL;
	}
	public void setThemeImageURL(String themeImageURL) {
		this.themeImageURL = themeImageURL;
	}
	public String getThemeDescription() {
		return themeDescription;
	}
	public void setThemeDescription(String themeDescription) {
		this.themeDescription = themeDescription;
	}
	public String getThemePhotographer() {
		return themePhotographer;
	}
	public void setThemePhotographer(String themePhotographer) {
		this.themePhotographer = themePhotographer;
	}
	public String getThemeVideographer() {
		return themeVideographer;
	}
	public void setThemeVideographer(String themeVideographer) {
		this.themeVideographer = themeVideographer;
	}
	public String getThemeReturnGift() {
		return themeReturnGift;
	}
	public void setThemeReturnGift(String themeReturnGift) {
		this.themeReturnGift = themeReturnGift;
	}
	public long getThemeCost() {
		return themeCost;
	}
	public void setThemeCost(long themeCost) {
		this.themeCost = themeCost;
	}
}
