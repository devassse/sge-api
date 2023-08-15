package com.keomagroup.sgs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keomagroup.sgs.repositories.UserRepository;
import com.keomagroup.sgs.entities.Users;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<Users> listAll(){
        return repository.findAll();
    }

    public Users getUser(int id){
        return repository.findById(id).get();
    }
    
}
