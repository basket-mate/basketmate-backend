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
    @Column(name = "video_id", nullable = false, unique = true)
    private String videoId;

    private String title;
    private String dishName;

    @Column(columnDefinition = "json")
    private String recipe;

    @Column(columnDefinition = "json")
    private String ingredient;
}
