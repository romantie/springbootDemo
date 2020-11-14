package com.lmk.springdemo.dao;

import com.lmk.springdemo.entity.LmkBook;

import java.util.List;

public interface LmkIBookDao {
    /**
     * 查询（1查询全部，2按编号查询）
     */

    List<LmkBook> selectBook();

    LmkBook selectBookById(int id);

    //添加图书
    int addBook(LmkBook book);
}
