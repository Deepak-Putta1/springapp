package com.examly.springapp.registerservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examly.springapp.model.User;
import com.examly.springapp.repository.RegisterRepository;

@Service
public class RegisterService {
    @Autowired
    private RegisterRepository registerrepository;

    public User register(User user){
       return registerrepository.save(user);
    }
    public User fetchemail(String email){
        return  registerrepository.findByEmail(email);
    }
    public User login(String tempEmail,String tempPass){
        return  registerrepository.findByEmailAndPassword(tempEmail,tempPass);
    }
}
