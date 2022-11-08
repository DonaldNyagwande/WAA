package com.miu.W1D2Lab2.service;

import com.miu.W1D2Lab2.domain.Post;
import com.miu.W1D2Lab2.domain.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserPostService  {
    public void savePostByUSerId(Post post, long id);
    public List<Post> findPostsByUserId(long id);

}
