package com.example.pgu.v1.config;

import com.example.pgu.v1.entity.AppUser;
import com.example.pgu.v1.entity.Role;
import com.example.pgu.v1.service.roleService;
import com.example.pgu.v1.service.userService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class startupConfig implements CommandLineRunner {

    @Autowired
    private final userService UserService;
    @Autowired
    private final roleService RoleService;

    @Override
    public void run(String... args) throws Exception {

        if(RoleService.getAll().isEmpty()){
            RoleService.insert(new Role(null,"admin"));
            RoleService.insert(new Role(null,"user"));
            RoleService.insert(new Role(null,"employee"));
        }


        if(UserService.getAll().isEmpty()){

            Set<Role> adminRoles = new HashSet<>();
            adminRoles.add(RoleService.getByName("admin"));

            Set<Role> userRoles = new HashSet<>();
            userRoles.add(RoleService.getByName("user"));

            Set<Role> employeeRoles = new HashSet<>();
            employeeRoles.add(RoleService.getByName("employee"));

            UserService.insert(new AppUser(null,"Ayoub Baraoui","Eyub2020","2020@2020",adminRoles));

            UserService.insert(new AppUser(null,"Ashraf Seroukh","Ashraf2020","2021@2021",userRoles));



        }

    }








}
