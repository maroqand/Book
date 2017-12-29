package com.example.demo.repo;

import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nsarvar on 12/25/17.
 */
@Repository
public interface ReadingListRepository{
    List<Book> findByReader(String reader);
}