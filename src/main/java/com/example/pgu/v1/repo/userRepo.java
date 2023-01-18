package com.example.pgu.v1.repo;

import com.example.pgu.v1.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface userRepo extends JpaRepository<AppUser,Long> {



}
