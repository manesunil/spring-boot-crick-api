package com.app.repo;

import com.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CrickRepo extends JpaRepository<User,Integer> {
    User findByEmailAndPass(String email, String pass);
}
