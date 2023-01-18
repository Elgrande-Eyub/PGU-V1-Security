package com.example.pgu.v1.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity()
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="secusers")

public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String Fullname;

    private String username;

    private String password;

    @ManyToMany
    @JoinTable(name="sec_user_roles",
         joinColumns = @JoinColumn(name="user_id"),
         inverseJoinColumns = @JoinColumn(name="role_id"))
    @OrderColumn(name="id")
    private Set<Role> roles = new HashSet<>();
}
