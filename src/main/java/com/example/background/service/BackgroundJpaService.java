package com.example.background.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.background.repository.*;
import com.example.background.model.*;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class BackgroundJpaService implements BackgroundRepository{

    @Autowired 
    private BackgroundJpaRepository BJR;

    @Override 
    public ArrayList<Background> getAllBackground(){
        List<Background> backgroundList = BJR.findAll();
        ArrayList<Background> arrayBackground= new ArrayList<>(backgroundList);
        return arrayBackground;
    }

    @Override 
    public Background addBackground(Background background){
        BJR.save(background);
        return background;
    }

    @Override 
    public Background updateBackground(int id, Background background){
        try{
            Background newBackground = BJR.findById(id).get();
            if(background.getName() != null){
                newBackground.setName(background.getName());
            }
            if(background.getAge() >= 0){
                newBackground.setAge(background.getAge());
            }
            if(background.getDataTime() != null){
                newBackground.setDataTime(LocalDateTime.now());
            }

            return BJR.save(newBackground);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }


    @Override
    public void deleteBackground(int id){
        try{
            BJR.deleteById( id);
        } catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}