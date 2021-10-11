package com.example.readingList.dao;

import com.example.readingList.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 10640
 * JpaRepository有18个执行常用持久化操作的方法
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {
    /**
     * @param reader
     * @return Book
     */
    List<Book> findByReader(String reader);
}
