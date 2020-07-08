package com.yakamy.jpademo.repository;

import com.yakamy.jpademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chenjunwei
 * @date 2020-04-27 16:48
 * @description
 */
public interface UserRepo extends JpaRepository<User, Long> {
}
