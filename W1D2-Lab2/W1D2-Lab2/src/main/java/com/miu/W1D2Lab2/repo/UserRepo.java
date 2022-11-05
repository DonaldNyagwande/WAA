package com.miu.W1D2Lab2.repo;

import com.miu.W1D2Lab2.domain.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Users, Long> {
}
