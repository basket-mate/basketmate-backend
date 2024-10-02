package com.basketmate.backend.video.service;

import com.basketmate.backend.video.entity.Video;
import com.basketmate.backend.video.repository.VideoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    private final VideoRepository videoRepository;

    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public Video saveVideo(Video video) {
        return videoRepository.save(video);
    }

    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public Video getVideoById(String id) {
        return videoRepository.findById(id).orElse(null);
    }

    public void deleteVideo(String id) {
        videoRepository.deleteById(id);
    }
}
