package com.sda.auction.mapper;

import com.sda.auction.dto.UserDTO;
import com.sda.auction.model.User;

public class UserMapper {

    public User convert(UserDTO userDTO){
        // convertim dto in entity
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        return user;


    }

    public UserDTO convert(User user){
        return null;
    }


}
