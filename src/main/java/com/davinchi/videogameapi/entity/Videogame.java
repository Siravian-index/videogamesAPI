package com.davinchi.videogameapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "videogame")
@Data
public class Videogame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String genre;
    private Double price;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
