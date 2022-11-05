package com.miu.W1D2Lab2.service;

import com.miu.W1D2Lab2.domain.Post;
import com.miu.W1D2Lab2.domain.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<Users> findAll();
    public Optional<Users> findById(long  id);
    public void save(Users user);

    public void deleteById(long id);

    public void addPost(long id,List<Post> post);
}
