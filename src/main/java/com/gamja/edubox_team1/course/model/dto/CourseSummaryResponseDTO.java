package com.gamja.edubox_team1.course.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CourseSummaryResponseDTO {

    private long id;

    private String title;

    private long creatorId;

    private String creatorName;

    private String imgURL;

    private String description;

    private int likes;

    private double rating;

    private long reviewCount;

    private int price;

    private int categoryId;

    private String categoryName;

    private long saleId;

    private String saleName;

    private int students;
}