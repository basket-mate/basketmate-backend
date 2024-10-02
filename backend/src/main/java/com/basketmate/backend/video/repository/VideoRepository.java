package com.basketmate.backend.video.repository;

import com.basketmate.backend.video.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, String> {}
