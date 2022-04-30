package com.davinchi.videogameapi.service;

import com.davinchi.videogameapi.entity.Company;
import com.davinchi.videogameapi.entity.Videogame;

import java.util.List;


public interface IVideogameService {
    List<Videogame> getAllVideogames();

    Company addVideogame(Videogame videogame);

    void deleteVideogame(Videogame videogame);

}
