package com.example.background.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.background.model.Background;

public interface BackgroundJpaRepository extends JpaRepository<Background, Integer> {
}

