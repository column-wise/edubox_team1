package com.gamja.edubox_team1.course.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Table(name = "lectures")
@Getter
@Setter
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long courseId;

    @Column
    private String title;

    @Column
    private int order;

    @Column
    private Timestamp createdAt;
}
