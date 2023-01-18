package com.example.pgu.v1.service;

import com.example.pgu.v1.entity.AppUser;
import com.example.pgu.v1.repo.userRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class userService  {

    @Autowired
    private userRepo UserRepo;

    public List<AppUser> getAll(){

        return  UserRepo.findAll();
    }
    public AppUser getById(Long id){

        return  UserRepo.findById(id).orElse(null) ;
    }

    public AppUser insert(AppUser user){
        return UserRepo.save(user);
    }
}
