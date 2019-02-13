package com.manifestcorp.techreadsCMA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manifestcorp.techreadsCMA.model.Book;
public interface BookRepository extends JpaRepository<Book, Long> {

}
