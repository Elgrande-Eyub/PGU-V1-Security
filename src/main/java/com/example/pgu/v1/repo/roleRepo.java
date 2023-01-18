package com.example.pgu.v1.repo;


import com.example.pgu.v1.entity.AppUser;
import com.example.pgu.v1.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface roleRepo extends JpaRepository<Role,Long> {


    Role getByName(String username);

}
