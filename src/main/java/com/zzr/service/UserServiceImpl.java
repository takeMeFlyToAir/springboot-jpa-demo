package com.zzr.service;

import com.zzr.api.UserService;
import com.zzr.dao.UserJpaRepository;
import com.zzr.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserJpaRepository userJpaRepository;

    public List<User> findAll() {
        return userJpaRepository.findAll();
    }

    public User saveUser(User user) {
        return userJpaRepository.save(user);
    }

    @Override
    public Page<User> findByPage(Pageable pageable) {
        return userJpaRepository.findAll(pageable);
    }
}