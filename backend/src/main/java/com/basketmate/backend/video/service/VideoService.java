package com.basketmate.backend.video.service;

import com.basketmate.backend.video.entity.Video;
import com.basketmate.backend.video.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class VideoService {
    private final VideoRepository videoRepository;

    public Video getVideoById(String id) {
        log.info("Fetching video with ID: {}", id);
        return videoRepository.findById(id).orElse(null);
    }

}