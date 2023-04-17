package com.app.service;

import com.app.model.User;

public interface CrickService {

    public User register(User user);
    public User login(String email,String pass);



}
