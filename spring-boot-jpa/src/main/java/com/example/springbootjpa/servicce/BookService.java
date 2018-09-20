package com.example.springbootjpa.servicce;

import com.example.springbootjpa.entity.Book;
import java.util.List;

/**
 * @author gaozhan
 */
public interface BookService {

    List<Book> findAll();

    Book findById(Long id);
}

