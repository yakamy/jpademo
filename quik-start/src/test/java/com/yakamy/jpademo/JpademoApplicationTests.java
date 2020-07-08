package com.yakamy.jpademo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootTest
class JpademoApplicationTests {

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    void contextLoads() {
        System.out.println(entityManager);

    }

}
