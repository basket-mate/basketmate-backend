package com.basketmate.backend.user.repository;

import com.basketmate.backend.user.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {}

