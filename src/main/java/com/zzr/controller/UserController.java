package com.zzr.controller;

import com.zzr.api.UserService;
import com.zzr.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add/{name}/{address}")
    public User addUser( @PathVariable String name,
                        @PathVariable String address){
        User user = new User();
        user.setName(name);
        user.setAddress(address);
        return userService.saveUser(user);
    }


    @RequestMapping(value = "/findAll")
    public List<User> findAll(){
        logger.info("========UserController==========findAll======================");
        return userService.findAll();
    }


    @RequestMapping(value = "/findByPage")
    public Page<User> findByPage(int pageNumber,int pageSize) {
        return userService.findByPage(PageRequest.of(pageNumber,pageSize));
    }

}