package com.korit.service;

import com.korit.main.entity.User;
import com.korit.repository.UserRepository;

public class UserServiceImpl implements UserService{


    @Override
    public void add(User user) {
        UserRepository userRepository = UserRepository.getInstance();
        UserRepository.addUser(user);
    }

    @Override
    public void remove() {


    }

    @Override
    public void printInfo() {


    }
}
