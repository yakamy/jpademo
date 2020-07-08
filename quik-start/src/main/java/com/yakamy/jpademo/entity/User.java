package com.yakamy.jpademo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @author chenjunwei
 * @date 2020-04-27 16:47
 * @description
 */
@Entity
@Data
public class User {

    @Id
    private Long id;

    private String name;

    private Long departmentId;

    private String telephone;

    private Timestamp createTime;

    private Timestamp updateTime;

}
