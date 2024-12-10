package com.examly.springapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.model.User;
import com.examly.springapp.registerservice.RegisterService;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:4200")
@Configuration
@RestController
@RequestMapping("/admin")
public class RegisterController {
    @Autowired
    private RegisterService registerservice;

    @PostMapping("/register")
    public User register(@RequestBody User user) throws Exception {
    String tempemail = user.getEmail();
    User userobj;
    if (tempemail != null || !"".equals(tempemail)) {
        userobj = registerservice.fetchemail(tempemail);

        if (userobj != null) {
            throw new Exception("User with email already exits");
        }
    }
    userobj = registerservice.register(user);
    return userobj;

    }
    @PostMapping("/login")
    public User login(@RequestBody User user) throws Exception {
        String tempEmail = user.getEmail();
        String tempPass = user.getPassword();
        String tempemail= user.getEmail();
        String temppass= user.getPassword();
        User userobj=null;
        if(tempemail!=null && temppass!=null) {

            userobj=registerservice.login(tempemail,temppass);
        }
        if(userobj==null){
            throw new Exception("User Dosen't exists");
        }
        return userobj;
    }
}
