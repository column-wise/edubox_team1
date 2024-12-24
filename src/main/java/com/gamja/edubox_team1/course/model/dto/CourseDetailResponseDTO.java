package com.gamja.edubox_team1.course.model.dto;

@Getter
@Setter
@AllArgsConstructor
public class CourseSummaryResponseDTO {

    private long id;

    private String title;

    private String description;

    private long creatorId;

    private String creatorName;

    private List<Integer> hashtagIds;

    private List<String> hashtagTitles;

    private int likes;

    private LocalDateTime createdAt;

    private int categoryId;

    private String categoryName;

    private long saleId;

    private String saleName;

    private int students;
}