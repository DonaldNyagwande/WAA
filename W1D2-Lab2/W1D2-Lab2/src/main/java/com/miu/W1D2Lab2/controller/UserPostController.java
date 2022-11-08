package com.miu.W1D2Lab2.controller;

import com.miu.W1D2Lab2.domain.Post;
import com.miu.W1D2Lab2.service.UserPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")

public class UserPostController {
    @Autowired
    UserPostService userPostService;


@GetMapping("/{id}/post")
    public List<Post> getAll(@PathVariable("id") long id){

    return userPostService.findPostsByUserId(id);
}
    @PostMapping ("{id}/post")
    public void save(@RequestBody Post post,@PathVariable("id") long id){
    userPostService.savePostByUSerId(post,id);
    }



}
