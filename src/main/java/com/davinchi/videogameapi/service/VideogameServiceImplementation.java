package com.davinchi.videogameapi.service;

import com.davinchi.videogameapi.entity.Videogame;
import com.davinchi.videogameapi.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideogameServiceImplementation implements  IVideogameService{

    private final VideogameRepository repository;

    @Autowired
    public VideogameServiceImplementation(VideogameRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Videogame> getAllVideogames() {
        return repository.findAll();
    }
}