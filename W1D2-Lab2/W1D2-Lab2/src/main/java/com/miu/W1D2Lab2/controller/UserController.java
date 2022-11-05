package com.miu.W1D2Lab2.controller;

import com.miu.W1D2Lab2.domain.Post;
import com.miu.W1D2Lab2.domain.Users;
import com.miu.W1D2Lab2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/users")

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public List<Users> findAll() {
        return  userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Users> findById(@PathVariable("id") long id) {
        return userService.findById(id);
    }
    @PostMapping
    public void save(@RequestBody Users user) {
        System.out.println(user.getName());
        userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id) {
        userService.deleteById(id);

    }
    @PostMapping("/{id}/posts")
    public void addPost(@PathVariable("id") long id,@RequestBody List<Post> post){
        userService.addPost(id,post);
    }

}

