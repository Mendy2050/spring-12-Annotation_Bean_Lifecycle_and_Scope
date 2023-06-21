package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Mendy
 * @create 2023-06-21 16:35
 */
@Repository
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ..." );
    }

    @PostConstruct
    public void init() {
        System.out.println("init....." );
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy...." );
    }
}

