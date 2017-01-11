package com.kilopo.tryshop.service;

import com.kilopo.tryshop.entity.Basket;
import com.kilopo.tryshop.entity.User;
import com.kilopo.tryshop.repository.BasketRepository;
import com.kilopo.tryshop.repository.StatusRepository;
import com.kilopo.tryshop.repository.UserRepository;
import com.kilopo.tryshop.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    BasketRepository basketRepository;

    @Autowired
    StatusRepository statusRepository;

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserById(long id){
        return userRepository.findOne(id);
    }

    public boolean blockUser(long id) {
        User user = userRepository.findOne(id);
        long i = 1;
        user.setStatus(statusRepository.findOne(i));
        return true;
    }

    public boolean deleteUser(long id) {
        userRepository.delete(id);
        return true;
    }

    public boolean register(User user) {
        userRepository.saveAndFlush(user);
        return true;
    }

    public void login() {

    }
}
