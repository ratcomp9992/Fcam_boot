package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity // Table로 변환시켜준다
@Data   // Lombok
public class Book {
    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increament
    private int id;     // 일련번호

    @Column(length = 50, nullable = false)
    private String title;
    private int price;
    private String name;
    private int page;
}
