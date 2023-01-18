package com.example.pgu.v1.auth;


import com.example.pgu.v1.service.roleService;
import com.example.pgu.v1.service.userService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/role")
@RequiredArgsConstructor
public class roleController {
    @Autowired
    private roleService RoleService;


    @GetMapping("")
    public ResponseEntity<?> getAll(){

        return ResponseEntity.ok(RoleService.getAll()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getID(@PathVariable Long id){

        return ResponseEntity.ok(RoleService.getById(id));
    }

}
