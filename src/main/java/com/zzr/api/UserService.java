package com.zzr.api;

import com.zzr.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
     List<User> findAll();

     User saveUser(User user);

     Page<User> findByPage(Pageable pageable);
}