package com.kilopo.tryshop.service;

import com.kilopo.tryshop.entity.User;
import com.kilopo.tryshop.repository.BasketRepository;
import com.kilopo.tryshop.repository.StatusRepository;
import com.kilopo.tryshop.repository.UserRepository;
import com.kilopo.tryshop.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BasketRepository basketRepository;

    @Autowired
    StatusRepository statusRepository;

    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");

        return user;
    }

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

    public User login(String login) {
        for(User us : userRepository.findAll()){
            if (us.getLogin().equals(login)) return us;
        }
        return null;
    }


}
