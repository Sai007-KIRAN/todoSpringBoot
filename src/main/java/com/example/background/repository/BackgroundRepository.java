package com.example.background.repository;

import com.example.background.model.Background;

import java.util.*;

public interface BackgroundRepository {
    ArrayList<Background> getAllBackground();

    Background addBackground(Background background);

    Background updateBackground(int id, Background background);

    void deleteBackground(int id);
}
