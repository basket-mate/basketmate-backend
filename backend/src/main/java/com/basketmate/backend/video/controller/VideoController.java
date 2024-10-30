package com.basketmate.backend.video.controller;

import com.basketmate.backend.video.entity.Video;
import com.basketmate.backend.video.service.VideoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/video")
@RequiredArgsConstructor
public class VideoController {
    private final VideoService videoService;

    @GetMapping("/{id}")
    public Video getVideoById(@PathVariable String id) {
        log.info("Received request to get video by ID: {}", id);
        Video video = videoService.getVideoById(id);

        if (video != null) {
            log.info("Video found: {}", video);
        } else {
            log.warn("Video with ID {} not found", id);
        }

        return video;
    }
}
