package com.davinchi.videogameapi.controller;

import com.davinchi.videogameapi.entity.Company;
import com.davinchi.videogameapi.entity.Videogame;
import com.davinchi.videogameapi.service.VideogameServiceImplementation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/videogames")
public class VideogameController {

    private final VideogameServiceImplementation videogameServiceImplementation;

    public VideogameController(VideogameServiceImplementation videogameServiceImplementation) {
        this.videogameServiceImplementation = videogameServiceImplementation;
    }

    @GetMapping
    public List<Videogame> getAllVideogames() {
        return videogameServiceImplementation.getAllVideogames();
    }

    @PostMapping
    public Company addVideogame(@RequestBody Videogame videogame) {
        return videogameServiceImplementation.addVideogame(videogame);
    }

    @DeleteMapping
    public void deleteVideogame(@RequestBody Videogame videogame) {
        videogameServiceImplementation.deleteVideogame(videogame);
    }
}
