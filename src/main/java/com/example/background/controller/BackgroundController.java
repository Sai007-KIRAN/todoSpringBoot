package com.example.background.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.background.service.*;
import com.example.background.model.*;

// @RestController
// public class BackgroundController {
//     @Autowired
//     private BackgroundJpaService BJS;

//     @GetMapping("/bg")
//     public ArrayList<Background> getAllBackground(){
//         return BJS.getAllBackground();
//     }

//     @PostMapping("/bg")
//     public Background addBackground(@RequestBody Background background){
//         return BJS.addBackground(background);
//     }

//     @PutMapping("/bg/{id}")
//     public Background updateBackground(@PathVariable("id") int id,@RequestBody Background background){
//         return BJS.updateBackground(id, background);
//     }

//     @DeleteMapping("/bg/{id}")
//     public void deleteBackground(@PathVariable("id") int id){
//         BJS.deleteBackground(id);
//     }
    
// }


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BackgroundController {
    @Autowired
    private BackgroundJpaService BJS;

    @GetMapping("/bg")
    public ArrayList<Background> getAllBackground() {
        return BJS.getAllBackground();
    }

    @PostMapping("/bg")
    public Background addBackground(@RequestBody Background background) {
        return BJS.addBackground(background);
    }

    @PutMapping("/bg/{id}")
    public Background updateBackground(@PathVariable("id") int id, @RequestBody Background background) {
        return BJS.updateBackground(id, background);
    }

    @DeleteMapping("/bg/{id}")
    public void deleteBackground(@PathVariable("id") int id) {
        BJS.deleteBackground(id);
    }
}
