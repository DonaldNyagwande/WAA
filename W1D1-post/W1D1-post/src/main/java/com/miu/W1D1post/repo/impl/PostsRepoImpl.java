package com.miu.W1D1post.repo.impl;

import com.miu.W1D1post.domain.Post;
import com.miu.W1D1post.repo.PostsRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PostsRepoImpl implements PostsRepo {
public static List<Post>posts;
private static int postId=5;

static {
    posts=new ArrayList<>();

    Post post1=new Post(1,"UEFA Champions League","Barcelona Vs Bayern ,Who will win","CNA");
    Post post2=new Post(2,"America 2024 Elections","Do you think Trump will win again","BBC");
    Post post3=new Post(3,"October Entry for Maharishi","Maharishi makes a significant recruitment this winter for new students","Fairfield Newspaper");
    Post post4=new Post(4,"Halloween Dance Party over the weekend","This weekend be our guest and join our Halloween  dance party","MIU Student group");
    posts.add(post1);
    posts.add(post2);
    posts.add(post3);
    posts.add(post4);


}


    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public Post getPostById(int id) {
        return posts.stream().filter(p->p.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public void save(Post post) {
    post.setId(postId);
    postId++;
    posts.add(post);

    }

    @Override
    public void delete(int id) {
//        Post post=posts.stream().filter(p->p.getId()==id)
//                .findFirst().get();
        Post post=getPostById(id);
       posts.remove(post);
    }

    @Override
    public void update(int id,Post post) {
    Post post1=getPostById(id);
    post1.setAuthor(post.getAuthor());
    post1.setContent(post.getContent());
    post1.setTitle(post.getTitle());

    }
}
