package com.davinchi.videogameapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String ceo;
    @OneToMany
    private List<Videogame> videogameList;

}
