package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository {
    // CRUD에 해당하는 메소드를 전부 제공해준다
}
