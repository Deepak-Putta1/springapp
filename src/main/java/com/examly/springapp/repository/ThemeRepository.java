package com.examly.springapp.repository;

import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Theme;


import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ThemeRepository extends JpaRepository<Theme,Integer>{


}
