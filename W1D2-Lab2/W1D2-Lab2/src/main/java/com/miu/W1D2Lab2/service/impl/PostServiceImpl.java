package com.miu.W1D2Lab2.service.impl;

import com.miu.W1D2Lab2.domain.Post;
import com.miu.W1D2Lab2.domain.Users;
import com.miu.W1D2Lab2.repo.PostRepo;
import com.miu.W1D2Lab2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepo postRepo;

    @Override
    public List<Post> findAll() {
        return (List<Post>) postRepo.findAll();
    }

    @Override
    public Optional<Post> findById(long id) {
        return postRepo.findById(id);
    }

    @Override
    public void save(Post post) {
        postRepo.save(post);
    }

    @Override
    public void deleteById(long id) {
        postRepo.deleteById(id);
    }

    @Override
    public void update(int id, Post post) {
        System.out.println("Before");
        Optional<Post> pst =postRepo.findById((long) id);
        System.out.println("Before method");
        if(pst.isPresent()){
            Post post1=pst.get();
            post1.setContent(post.getContent());
            post1.setAuthor(post.getAuthor());
           post1.setTitle(post.getTitle());
            System.out.println("After");
            postRepo.save(post1);

        }




    }


}
