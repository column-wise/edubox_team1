package com.gamja.edubox_team1.course.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "courses")
@Getter
@Setter
public class Course {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private long creator_id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int likes;

    @Column(nullable = false)
    private Timestamp createdAt;

    @Column(nullable = false)
    private int price;

    @Column
    private long saleId;

    @Column(nullable = false)
    private long students;

    @JoinTable(
            name = "course_hashtags", // 중간 테이블 이름
            joinColumns = @JoinColumn(name = "course_id"), // 현재 엔터티와 연결된 컬럼
            inverseJoinColumns = @JoinColumn(name = "hashtag_id") // 반대 엔터티와 연결된 컬럼
    )
    private List<Hashtag> hashtags;
}

@Entity
@Table(name = "hashtags")
@Getter
@Setter
public class Hashtag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @ManyToMany(mappedBy = "hashtags") // 반대편의 관계 매핑
    private List<Course> courses;
}