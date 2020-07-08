package com.yakamy.jpademo.controller;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.yakamy.jpademo.entity.Dept;
import com.yakamy.jpademo.entity.QUser;
import com.yakamy.jpademo.entity.User;
import com.yakamy.jpademo.repository.DeptRepo;
import com.yakamy.jpademo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenjunwei
 * @date 2020-04-27 16:59
 * @description
 */
@RestController
public class BaseController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private DeptRepo deptRepo;

    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    @GetMapping("/user")
    public List<User> userList(){
        List<User> userList = userRepo.findAll();
        return userList;
    }

    @GetMapping("/dept")
    public List<Dept> deptList(){
        List<Dept> deptList = deptRepo.findAll();
        return deptList;
    }

    @PostMapping("/user")
    public User userSave(@RequestBody User user){
        return userRepo.save(user);
    }

    @PostMapping("/user/search")
    public List<User> userSearch(@RequestBody User user){
        QUser qUser = QUser.user;
        List<User> fetch = jpaQueryFactory.selectFrom(qUser)
                                          .where(qUser.name.eq(user.getName()))
                                          .fetch();
        return fetch;
    }
}
