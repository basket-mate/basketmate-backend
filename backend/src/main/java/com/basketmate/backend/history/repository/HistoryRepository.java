package com.basketmate.backend.history.repository;

import com.basketmate.backend.history.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {}
