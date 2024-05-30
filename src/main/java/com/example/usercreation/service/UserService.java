package com.example.usercreation.service;

import com.example.usercreation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void saveUser(User user) {
        String sql = "INSERT INTO users (email, username, password) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, user.getEmail(), user.getUsername(), user.getPassword());
    }
}
