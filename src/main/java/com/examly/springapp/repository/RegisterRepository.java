package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.User;

@Repository
public interface RegisterRepository extends JpaRepository<User,Integer> {

    User findByEmailAndPassword(String tempEmail, String tempPass);

    User findByEmail(String email);
}
