package com.support.ticketing.controllers;

import com.support.ticketing.contracts.UserRequest;
import com.support.ticketing.models.User;
import com.support.ticketing.services.UserService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final PasswordEncoder passwordEncoder;
    private final UserService userService;

    public UserController(PasswordEncoder passwordEncoder, UserService userService){
        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody UserRequest userRequest){
        userRequest.setPassword(passwordEncoder.encode(userRequest.getPassword()));
        userService.registerUser(userRequest);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserRequest userRequest){
        return userService.loginUser(userRequest);
    }

}