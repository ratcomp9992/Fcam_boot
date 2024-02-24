package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service    // 트랜잭션 처리
public class BookService {
    @Autowired
    private BookRepository repository;

    // 전체 리스트 가져오기
    public List<Book> getList() {
        return repository.findAll();    // select * from book
    }

    // 특정 레코드 가져오기
    public Book getById(Long id) {
        Optional<Book> optional =repository.findById(id);

        if(optional.isPresent()){
            return optional.get();
        }else{
            throw new RuntimeException("Book not found with id: " + id);
        }


    }

    // 데이터 등록하기
    public Book register(Book book) {
        return repository.save(book);
    }

    // 데이터 수정하기
    @Transactional
    public Book update(Long id, Book requestBook) {
        Optional<Book> optional = repository.findById(id);
        if (optional.isPresent()) {
            Book book = optional.get();
            book.setTitle(requestBook.getTitle());
            book.setPrice(requestBook.getPrice());

            return book;
        } else {
            throw new RuntimeException("Book not found with id: " + id);
        }//
    }

    // 데이터 삭제하기
    public void getByDelete(Long id){
        repository.deleteById(id);
    }
}
