package com.kilopo.tryshop.service.interfaces;

import com.kilopo.tryshop.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
    boolean blockUser(long id);
    boolean deleteUser(long id);
    boolean register(User user);
    void login();
    User getUserById(long id);

}
