package com.app.service.impl;

import com.app.model.User;
import com.app.repo.CrickRepo;
import com.app.service.CrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrickServiceImpl implements CrickService {

    @Autowired
   private CrickRepo crickRepo;
    @Override
    public User register(User user) {
        return crickRepo.save(user);
    }

    @Override
    public User login(String email, String pass) {
        return crickRepo.findByEmailAndPass(email,pass);
    }
}
