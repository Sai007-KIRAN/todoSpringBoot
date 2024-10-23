// package com.example.background.model;


// import jakarta.persistence.*;

// import java.time.LocalDateTime;

// @Entity
// @Table(name = "BACKGROUND")
// public class Background {

//     @Id
//     @Column(name="id")
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;

//     @Column(name = "name")
//     private String name;

//     @Column(name = "age")
//     private int age;

//     @Column(name = "datatime")
//     private LocalDateTime dataTime;

//     public Background(){
//         this.dataTime = LocalDateTime.now();
//     }

//     public Background(int id, String name, LocalDateTime dataTime, int age){
//         this.id = id;
//         this.name = name;
//         this.age = age;
//         this.dataTime = dataTime;
//     }

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public LocalDateTime getDataTime() {
//         return dataTime;
//     }

//     public void setDataTime(LocalDateTime dataTime) {
//         this.dataTime = dataTime;
//     }
// }


package com.example.background.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "BACKGROUND")
public class Background {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "datatime")
    private LocalDateTime dataTime;

    public Background(){
        this.dataTime = LocalDateTime.now();
    }

    public Background(int id, String name, LocalDateTime dataTime, int age){
        this.id = id;
        this.name = name;
        this.age = age;
        this.dataTime = dataTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }
}

