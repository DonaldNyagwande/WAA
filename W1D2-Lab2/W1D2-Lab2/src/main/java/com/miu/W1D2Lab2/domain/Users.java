package com.miu.W1D2Lab2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Users {
@Id
@GeneratedValue()
    long id;
    String name;
    @OneToMany
    @JoinColumn
    List<Post> posts=new ArrayList<>();

    public void addPost(Post post){
        posts.add(post);
    }


}
