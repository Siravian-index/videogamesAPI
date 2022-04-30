package com.davinchi.videogameapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "company")
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String ceo;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Videogame> videogameList = new ArrayList<>();

    public Company addVideogame(Videogame videogame) {
        this.videogameList.add(videogame);
        return this;
    }

}
