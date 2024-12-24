package com.gamja.edubox_team1.course.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "courses")
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private long creator_id;

    @Column
    private String imgURL;

    @Column(nullable = false)
    private String description;

    @Column
    // BigDecimal: JPA에서 DECIMAL과 가장 호환성이 좋지만
    // 평점은 정밀도가 부족해도 상관 없어서 double 사용
    private double rating;
    
    @Column
    private long reviewCount;

    @Column(nullable = false)
    private int likes;

    @Column(nullable = false)
    private Timestamp createdAt;

    @Column(nullable = false)
    private int categoryId;

    @Column(nullable = false)
    private int price;

    @Column
    private Long saleId;  // saleId는 null일 수 있으므로 Long 사용

    @Column(nullable = false)
    private long students;

    @Column(nullable = false)
    private int lectures; // 강의 수
}
