package com.davinchi.videogameapi.service;

import com.davinchi.videogameapi.entity.Company;
import com.davinchi.videogameapi.entity.Videogame;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface IVideogameService {
    List<Videogame> getAllVideogames();

    Company addVideogame(@RequestBody Videogame videogame);

    Boolean deleteVideogame(Videogame videogame);
//    Boolean deleteVideogameFrom(Company company);

//    take company id -> find company by id -> return company game list!
//    List<Videogame> getVideogamesFrom(Company company);
//

}
