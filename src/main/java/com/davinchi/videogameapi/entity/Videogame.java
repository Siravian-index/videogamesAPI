package com.davinchi.videogameapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Videogame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Double price;
}
