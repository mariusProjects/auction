package com.sda.auction.controller;

import com.sda.auction.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/register")
public class Registration {

    @GetMapping
    public ResponseEntity<String> get(){
        return new ResponseEntity<>("Hello world", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> post(@Valid @RequestBody UserDTO userDTO){  // se adauga @valid pentru a folosi validarile adnotate
        System.out.println("am primit " + userDTO);

        return new ResponseEntity<>("post triggered", HttpStatus.OK);
    }
}
