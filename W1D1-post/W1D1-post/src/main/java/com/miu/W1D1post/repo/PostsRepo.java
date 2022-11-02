package com.miu.W1D1post.repo;

import com.miu.W1D1post.domain.Post;

import java.util.List;

public interface PostsRepo {
    public List<Post> findAll();
    public Post getPostById(int id);

}
