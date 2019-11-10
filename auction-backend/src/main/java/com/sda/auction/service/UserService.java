package com.sda.auction.service;

import com.sda.auction.dto.UserDTO;
import com.sda.auction.model.User;
import org.springframework.stereotype.Service;


public interface UserService {
    UserDTO addUser(UserDTO userDTO);

    User findByEmail(String email);
}
