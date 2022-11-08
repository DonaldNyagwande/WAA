package com.miu.W1D2Lab2.service.impl;

import com.miu.W1D2Lab2.domain.Post;
import com.miu.W1D2Lab2.domain.Users;
import com.miu.W1D2Lab2.repo.UserRepo;
import com.miu.W1D2Lab2.service.UserPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
@Transactional

public class UserPostServiceImpl implements UserPostService {
    @Autowired
    UserRepo userRepo;
    @Override
    public void savePostByUSerId(Post post, long id) {
        Optional<Users> user= userRepo.findById(id);
        if(user.isPresent()){
            Users users=user.get();
            System.out.println("Im here");
            users.addPost(post);
            System.out.println("Im 22");
            userRepo.save(users);
            System.out.println("Im 33");
        }
    }

    @Override
    public List<Post> findPostsByUserId(long id) {
        Optional<Users> users=userRepo.findById(id);
        List<Post>userPst=new ArrayList<>();
        if(users.isPresent()){
            Users users1=users.get();
            userPst=users1.getPosts().stream().filter(a->a.getId()==id).toList();


        }
       return userPst;

    }
}
