package com.lmk.springdemo.service.impl;

import com.lmk.springdemo.dao.LmkIBookDao;
import com.lmk.springdemo.dao.impl.LmkIBookDaoImpl;
import com.lmk.springdemo.entity.LmkBook;
import com.lmk.springdemo.service.LmkIbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LmkBookServiceImpl implements LmkIbookService {
    @Autowired
    LmkIBookDao bookDao;

    @Override
    public List<LmkBook> findAllBook() {
        return bookDao.selectBook();
    }

    @Override
    public LmkBook findBookById(int id) {
        return bookDao.selectBookById(id);
    }

    @Override
    public int addBook(LmkBook lmkBook) {
        return bookDao.addBook(lmkBook);
    }
}
