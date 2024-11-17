package com.basketmate.backend.video.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "video")
public class Video {

    @Id
    @Column(name = "video_id", nullable = false, unique = true, length = 255)
    private String videoId;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "dish_name", nullable = false, length = 255)
    private String dishName;

    @Column(name = "recipe", columnDefinition = "JSON")
    private String recipe;

    @Column(name = "ingredient", columnDefinition = "JSON")
    private String ingredient;
}