package com.lmk.springdemo.service;

import com.lmk.springdemo.entity.LmkBook;

import java.util.List;

public interface LmkIbookService {
    /**
     * 查询所有图书
     */
    List<LmkBook> findAllBook();

    /**
     * 按编号查询
     */
    LmkBook findBookById(int id);

    /**
     * 添加图书
     */
    int addBook(LmkBook lmkBook);

}
