package com.davinchi.videogameapi.service;

import com.davinchi.videogameapi.entity.Company;
import com.davinchi.videogameapi.entity.Videogame;
import com.davinchi.videogameapi.repository.CompanyRepository;
import com.davinchi.videogameapi.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideogameServiceImplementation implements IVideogameService {

    private final VideogameRepository videogameRepository;
    private final CompanyRepository companyRepository;

    @Autowired
    public VideogameServiceImplementation(VideogameRepository videogameRepository, CompanyRepository companyRepository) {
        this.videogameRepository = videogameRepository;
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Videogame> getAllVideogames() {
        return videogameRepository.findAll();
    }

    @Override
    public Company addVideogame(Videogame videogame) {
        Optional<Company> companyOptional = companyRepository.findById(videogame.getId());
        if (companyOptional.isPresent()) {
            Company company = companyOptional.get();
            company.addVideogame(videogame);
            videogameRepository.save(videogame);
            return companyRepository.save(company);
        }
        System.out.println("Cannot add videogame to a non-existent company");
        return null;
    }

    @Override
    public void deleteVideogame(Videogame videogame) {
        videogameRepository.deleteById(videogame.getId());
    }


}
