package com.example.crudapi.service;

import com.example.crudapi.bean.BookBean;

public interface BookService extends BaseService<BookBean, Integer> {
    @Override
    int addBook(BookBean book);

    @Override
    int getBook(Integer integer);

    @Override
    int getBooks();

    @Override
    int updateBookInfo(BookBean book);

    @Override
    int deleteBook(Integer integer);
}
