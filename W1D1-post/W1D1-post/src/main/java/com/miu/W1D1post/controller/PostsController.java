package com.miu.W1D1post.controller;

import com.miu.W1D1post.domain.Post;
import com.miu.W1D1post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/posts")
public class PostsController {
    @Autowired
    PostService postService;

    @GetMapping("/")
    public List<Post> getAll(){
        return postService.findAll();

    }
    @GetMapping("/{id}")
    public Post getPostById(@PathVariable("id")int id){
        return postService.getPostById( id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save (@RequestBody Post post){
        postService.save(post);
    }

}
