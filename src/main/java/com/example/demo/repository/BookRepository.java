package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // CRUD에 해당하는 메소드를 전부 제공해준다

    // 전체 리스트 가져오기 - findAll()  : SELECT
    // 특정 레코드 가져오기 - findById(PK값)   : SELECT
    // 특정 레코드 가져오기 - findByTitle(PK값)   : SELECT 쿼리 메소드 => findBy+속성이름()
    // findByTitleANDPrice(String title, int price)
    //          =>  select * from Book b where b.title=#{title} and b.price=#{price}

    // 데이터 입력하기 - save()    : INSERT
    // 데이터 수정하기 - save(PK)    : UPDATE
            // INSERT, UPDATE는 PK 값의 유무에 따라 나뉨

    // 데이터 삭제하기 - deleteById(PK)  : DELETE
}

// EntityManagerFactory