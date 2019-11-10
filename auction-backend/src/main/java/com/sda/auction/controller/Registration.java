package com.sda.auction.controller;

import com.sda.auction.dto.UserDTO;
import com.sda.auction.model.User;
import com.sda.auction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/register")
public class Registration {
    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<String> get() {
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserDTO> post(@Valid @RequestBody UserDTO userDTO) {  // se adauga @valid pentru a folosi validarile adnotate
        User user = userService.findByEmail(userDTO.getEmail());
        if(emailAlreadyRegistered((userDTO.getEmail()))){
            System.out.println("email already in db");
        return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
    }
        UserDTO userDTOResult = userService.addUser(userDTO);
        return new ResponseEntity<>(userDTOResult, HttpStatus.OK);
    }
    private boolean emailAlreadyRegistered(String email){
        User user = userService.findByEmail(email);
        return  user != null;
    }
}
