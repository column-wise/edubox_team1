package com.gamja.edubox_team1.course.model.dto;

import com.gamja.edubox_team1.course.model.entity.Hashtag;
import com.gamja.edubox_team1.course.model.entity.Lecture;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CourseDetailResponseDTO {

    private long id;

    private String title;

    private String description;

    private long creatorId;

    private String creatorName;

    private String imgURL;

    private List<Hashtag> hashtags;

    private int likes;

    private double rating;

    private long reiewCount;

    private LocalDateTime createdAt;

    private int categoryId;

    private String categoryName;

    private long saleId;

    private String saleName;

    private int students;

    private List<Lecture> lectures;
}
