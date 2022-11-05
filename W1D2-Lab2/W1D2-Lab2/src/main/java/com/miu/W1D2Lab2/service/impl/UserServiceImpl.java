package com.miu.W1D2Lab2.service.impl;

import com.miu.W1D2Lab2.domain.Post;
import com.miu.W1D2Lab2.domain.Users;
import com.miu.W1D2Lab2.repo.UserRepo;
import com.miu.W1D2Lab2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;
    @Override
    public List<Users> findAll() {
        return (List<Users>) userRepo.findAll();
    }

    @Override
    public Optional<Users> findById(long id) {
        return userRepo.findById(id);
    }

    @Override
    public void save(Users user) {
        userRepo.save(user);
    }

    @Override
    public void deleteById(long id) {
        userRepo.deleteById(id);

    }

    @Override
    public void addPost(long id, List<Post>post) {
        Optional<Users> users=userRepo.findById(id);
        if(users.isPresent()){
            Users users1=users.get();


        }
    }
}
