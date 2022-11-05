package com.miu.W1D2Lab2.repo;

import com.miu.W1D2Lab2.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post,Long> {
}
