package com.desafiopicpay.service;

import com.desafiopicpay.repository.dao.UserDao;
import com.desafiopicpay.repository.dto.UserDto;
import com.desafiopicpay.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao dao;

    public User findUserById(Long id) throws Exception {
        return this.dao.findUserById(id).orElseThrow(() -> new Exception("Usuário não encontrado "));
    }

    public User createUser(UserDto data) {
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers() {
        return this.dao.findAll();
    }

    public void saveUser(User user) {
        this.dao.save(user);
    }
}
