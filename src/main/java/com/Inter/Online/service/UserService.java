package com.Inter.Online.service;

import com.Inter.Online.dtos.userDTO.UserRequestDTO;
import com.Inter.Online.dtos.userDTO.UserResponseDTO;
import com.Inter.Online.model.Account;
import com.Inter.Online.model.User;
import com.Inter.Online.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        var Account = new Account();
        Account.setUser(user);
        user.setAccount(Account);
        return userRepository.save(user);
    }
}
