package com.davinchi.videogameapi.repository;

import com.davinchi.videogameapi.entity.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideogameRepositoy extends JpaRepository<Videogame, Long> {
}
