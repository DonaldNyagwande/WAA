package com.miu.W1D2Lab2.service;

import com.miu.W1D2Lab2.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    public List<Post> findAll();
    public Optional<Post> findById(long  id);
    public void save(Post post);

    public void deleteById(long id);
    public void update (int id ,Post post);
}
