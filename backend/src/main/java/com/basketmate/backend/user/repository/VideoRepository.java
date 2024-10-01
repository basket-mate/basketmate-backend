package com.basketmate.backend.user.repository;

import com.basketmate.backend.user.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, String> {}
