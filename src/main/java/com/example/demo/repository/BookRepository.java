package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // CRUD에 해당하는 메소드를 전부 제공해준다

    // 전체 리스트 가져오기 - findAll()  : SELECT
    // 특정 레코드 가져오기 - findById(PK값)   : SELECT
    // findByTitleANDPrice(String title, int price)
    //          =>  select * from Book b where b.title=#{title} and b.price=#{price}

    // 데이터 입력하기 - save()    : INSERT
    // 데이터 수정하기 - save(PK)    : UPDATE
            // INSERT, UPDATE는 PK 값의 유무에 따라 나뉨

    // 데이터 삭제하기 - deleteById(PK)  : DELETE

    // 2. 쿼리 메소드
    //Book findByTitleAndName(String title, String name);

    // 3. JPQL 형식
    // @Query("select b from Book b where b.title=:title and b.name=:name")   ->  Entity 명과 같아야 함 + 인스턴스 만들어야 함
    // Book findByTitleName(String title, String name);

    // 4. native 형식
    @Query(value = "select * from book where title=?1 and name=?2", nativeQuery = true)
    Book findByTitleName(String title, String name);
}

// EntityManagerFactory