package com.lmk.springdemo.dao.impl;

import com.lmk.springdemo.dao.LmkIBookDao;
import com.lmk.springdemo.entity.LmkBook;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LmkIBookDaoImpl implements LmkIBookDao {
    private List<LmkBook> lmkBooks = new ArrayList<>();
    public LmkIBookDaoImpl(){
        lmkBooks.add(new LmkBook(1,"计算机网络",45, "images/load/20201110213225311.jpg"));
        lmkBooks.add(new LmkBook(2,"计算机组成",45, "images/load/20201112162354992.jpg"));
        lmkBooks.add(new LmkBook(3,"Javaee",45,"images/load/20201110213225311.jpg"));
        lmkBooks.add(new LmkBook(4,"大学物理",45, "images/load/20201110213225320.jpg"));
        lmkBooks.add(new LmkBook(5,"大学英语",45,"images/load/20201110213225321.jpg"));

    }

    @Override
    public List<LmkBook> selectBook() {
        return lmkBooks;
    }

    @Override
    public LmkBook selectBookById(int id) {
        for (LmkBook lmkBook:lmkBooks){
            if(lmkBook.getId() == id){
                return lmkBook;
            }
        }
        return null;
    }

    @Override
    public int addBook(LmkBook book) {
        if (lmkBooks.add(book)){
            return 1;
        }
        return 0;
    }
}
