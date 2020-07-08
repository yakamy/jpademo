package com.yakamy.jpademo.init;

import org.hibernate.engine.spi.SessionImplementor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Connection;

/**
 * @author chenjunwei
 * @date 2020-04-27 16:56
 * @description
 */
@Component
public class TableInit {


    @PersistenceContext
    private EntityManager entityManager;

    public void running() {
        ClassPathResource classPathResource = new ClassPathResource("init.sql");
        SessionImplementor sessionImplementor = entityManager.unwrap(SessionImplementor.class);
        Connection connection = sessionImplementor.connection();
        ScriptUtils.executeSqlScript(connection, classPathResource);
    }
}
