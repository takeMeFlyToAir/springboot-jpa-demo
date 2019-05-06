package com.zzr.dao;

import com.zzr.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhaozhirong on 2019/4/17.
 */
public interface UserJpaRepository extends JpaRepository<User,Long>{
}
