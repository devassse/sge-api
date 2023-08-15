package com.keomagroup.sgs.controllers;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.keomagroup.sgs.entities.Users;
import com.keomagroup.sgs.services.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<Users> get(@PathVariable int id) {
        try {
            Users user = userService.getUser(id);
            return new ResponseEntity<Users>(user, HttpStatus.OK);
        } catch (NoSuchElementException ex){
            System.out.println("Error Getting User With ID " + id);
            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
        }
    }
}
