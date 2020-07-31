package com.yakamy.jpademo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @author chenjunwei
 * @date 2020-07-08 16:17
 * @description
 */
@Entity
@Data
public class Dept extends AbstractEntity<Long> {

    @Id
    private Long id;

    private String name;

    private Timestamp createTime;

    private Timestamp updateTime;

}
