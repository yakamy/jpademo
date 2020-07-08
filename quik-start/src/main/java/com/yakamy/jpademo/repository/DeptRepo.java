package com.yakamy.jpademo.repository;

import com.yakamy.jpademo.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chenjunwei
 * @date 2020-07-08 16:18
 * @description
 */
public interface DeptRepo extends JpaRepository<Dept, Long> {

}
