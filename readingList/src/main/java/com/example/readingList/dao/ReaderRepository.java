package com.example.readingList.dao;

import com.example.readingList.dto.Reader;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 * @author 10640
 */
public interface ReaderRepository extends JpaRepository<Reader,String> {

}
