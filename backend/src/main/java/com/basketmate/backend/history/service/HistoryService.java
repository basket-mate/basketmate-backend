package com.basketmate.backend.history.service;

import com.basketmate.backend.history.entity.History;
import com.basketmate.backend.history.repository.HistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {
    private final HistoryRepository historyRepository;

    public HistoryService(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    public History saveHistory(History history) {
        return historyRepository.save(history);
    }

    public List<History> getAllHistories() {
        return historyRepository.findAll();
    }

    public History getHistoryById(Long id) {
        return historyRepository.findById(id).orElse(null);
    }

    public void deleteHistory(Long id) {
        historyRepository.deleteById(id);
    }
}
