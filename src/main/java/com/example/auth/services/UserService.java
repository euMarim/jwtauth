package com.example.auth.services;

import com.example.auth.domain.user.User;
import com.example.auth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow();
    }

    public User updateUser(String username, User user) {
        User oldUser = userRepository.findByLogin(username);

        oldUser.setLogin(user.getLogin());
        oldUser.setPassword(user.getPassword());
        return userRepository.save(oldUser);
    }

    public User updateUserById(String id, User user) {
        User oldUser = userRepository.findById(id).orElseThrow();

        oldUser.setLogin(user.getLogin());
        oldUser.setPassword(user.getPassword());
        return userRepository.save(oldUser);
    }

    public User deleteUser(String id) {
        User oldUser = userRepository.findById(id).orElseThrow();
        userRepository.delete(oldUser);
        return oldUser;
    }
}
