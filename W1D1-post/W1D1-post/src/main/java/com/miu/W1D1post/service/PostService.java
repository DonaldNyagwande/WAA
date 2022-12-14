package com.miu.W1D1post.service;

import com.miu.W1D1post.domain.Post;

import java.util.List;

public interface PostService {
    public List<Post> findAll();
    public Post getPostById(int id);
    public void save(Post post);

    public void delete(int id);
    public void update (int id ,Post post);
}
