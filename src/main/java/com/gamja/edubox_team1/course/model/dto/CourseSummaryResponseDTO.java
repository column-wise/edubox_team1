package com.gamja.edubox_team1.course.model.dto;

@Getter
@Setter
@AllArgsConstructor
public class CourseSummaryResponseDTO {

    private long id;

    private String title;

    private long creatorId;

    private String creatorName;

    private int likes;

    private int price;

    private int categoryId;

    private String categoryName;

    private long saleId;

    private String saleName;

    private int students;
}