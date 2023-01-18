package com.example.pgu.v1.service;


import com.example.pgu.v1.entity.AppUser;
import com.example.pgu.v1.entity.Role;
import com.example.pgu.v1.repo.roleRepo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class roleService {

    @Autowired
    private roleRepo RoleRepo;

    public List<Role> getAll(){

        return  RoleRepo.findAll();
    }
    public Role getById(Long id){

        return  RoleRepo.findById(id).orElse(null) ;
    }

    public Role getByName(String username){
        return RoleRepo.getByName(username);
    }
    public Role insert(Role role){
        return RoleRepo.save(role);
    }
}
