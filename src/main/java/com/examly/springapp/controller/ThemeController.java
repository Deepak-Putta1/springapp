package com.examly.springapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Theme;
import com.examly.springapp.repository.ThemeRepository;
import com.examly.springapp.exception.*;
import org.springframework.context.annotation.Configuration;
@CrossOrigin(origins = "http://localhost:4200")
@Configuration
@RestController
@RequestMapping("/admin")
public class ThemeController {
	
	@Autowired
	private ThemeRepository themeRepository;
	
	// get all employees
	@GetMapping("/theme")
	public List<Theme> getAllEmployees(){
		return themeRepository.findAll();
	}
	
	// create employee restapi
	@PostMapping("/theme")
	public Theme createTheme(@RequestBody Theme theme) {
		return themeRepository.save(theme);
	}
	
	//getting theme by id restapi
	@GetMapping("/theme/{id}")
	public ResponseEntity<Theme> getThemeById(@PathVariable Integer id) {
		Theme theme = themeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok(theme);
	}
	
	//update theme by id restapi
	@PutMapping("/theme/{id}")
	public ResponseEntity<Theme> updateTheme(@PathVariable Integer id,@RequestBody Theme themeDetails){
		Theme theme = themeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		theme.setThemeName(themeDetails.getThemeName());
		theme.setThemeImageURL(themeDetails.getThemeImageURL());
		theme.setThemeDescription(themeDetails.getThemeDescription());
		theme.setThemePhotographer(themeDetails.getThemePhotographer());
		theme.setThemeVideographer(themeDetails.getThemeVideographer());
		theme.setThemeReturnGift(themeDetails.getThemeReturnGift());
		theme.setThemeCost(themeDetails.getThemeCost());
		
		Theme updatedTheme = themeRepository.save(theme);
		return ResponseEntity.ok(updatedTheme);
		
	}
	
	@DeleteMapping("/theme/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Integer id){
		Theme theme = themeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		themeRepository.delete(theme);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
