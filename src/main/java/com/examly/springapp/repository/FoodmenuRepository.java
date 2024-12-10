package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.*;

@Repository
public interface FoodmenuRepository extends CrudRepository<MenuModel,Integer>{

}
