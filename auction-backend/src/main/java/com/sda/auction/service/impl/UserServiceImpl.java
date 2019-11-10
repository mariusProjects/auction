package com.sda.auction.service.impl;

import com.sda.auction.dto.UserDTO;
import com.sda.auction.mapper.UserMapper;
import com.sda.auction.model.User;
import com.sda.auction.service.UserService;

public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    @Override
    public UserDTO addUser(UserDTO userDTO) {
        //convert dto in entity
        User user = userMapper.convert(userDTO);
        // persistam in db
        return userDTO;
    }
}
