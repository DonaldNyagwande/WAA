package com.miu.W1D1post.service.impl;

import com.miu.W1D1post.domain.Post;
import com.miu.W1D1post.repo.PostsRepo;
import com.miu.W1D1post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostsRepo postsRepo;
    @Override
    public List<Post> findAll() {
        return postsRepo.findAll();
    }

    @Override
    public Post getPostById(int id) {
        return postsRepo.getPostById(id);
    }

    @Override
    public void save(Post post) {
        postsRepo.save(post);
    }
}
