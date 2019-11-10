package com.sda.auction.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data                            // creaza hide getter si setter
@EqualsAndHashCode               // suprascrie equals si hashcode

public class UserDTO {

    private Integer id;

    @NotEmpty
    @Pattern(regexp = "[A-Z a-z/s]+", message = "Letters only!")
    private String firstName;

    @NotEmpty
    @Pattern(regexp = "[A-Z a-z/s]+", message = "Letters only!")
    private String lastName;

    @Email(message = "{error.user.email.pattern}")   //validator pt email
    private String email;

    @Pattern(regexp = "((.*)[A-Z]+(.*))", message = "Password should contain at last one capital letter!")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;
}
