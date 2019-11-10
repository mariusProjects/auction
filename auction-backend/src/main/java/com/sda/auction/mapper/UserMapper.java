package com.sda.auction.mapper;

import com.sda.auction.dto.UserDTO;
import com.sda.auction.model.User;
import org.springframework.stereotype.Service;

@Service
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
        // convertim entity in DTO
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setId(user.getId());

        return userDTO;
    }
}
