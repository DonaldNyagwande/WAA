package com.miu.W1D2Lab2.controller;

import com.miu.W1D2Lab2.domain.Post;
import com.miu.W1D2Lab2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<Post> getPostById(@PathVariable("id")int id){
        return postService.findById( id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save (@RequestBody Post post){
        postService.save(post);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id ){
        postService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void update (@PathVariable("id") int id,@RequestBody Post post){
        postService.update(id,post);
    }



}
