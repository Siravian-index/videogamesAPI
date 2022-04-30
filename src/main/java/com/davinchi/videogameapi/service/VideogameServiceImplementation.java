package com.davinchi.videogameapi.service;

import com.davinchi.videogameapi.entity.Company;
import com.davinchi.videogameapi.entity.Videogame;
import com.davinchi.videogameapi.repository.CompanyRepository;
import com.davinchi.videogameapi.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class VideogameServiceImplementation implements  IVideogameService{

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
        Company company = videogame.getCompany();
        List<Videogame> videogameList = company.getVideogameList();
        boolean contains = videogameList.contains(videogame);
        if (!contains) {
            company.addVideogame(videogame);
            companyRepository.save(company);
            videogameRepository.save(videogame);
            return company;
        }
        return company;
    }

    @Override
    public Boolean deleteVideogame(Videogame videogame) {
        Company company = videogame.getCompany();
        List<Videogame> filtered = company
                .getVideogameList()
                .stream()
                .filter(videogame1 -> !Objects.equals(videogame1.getId(), videogame.getId()))
                .toList();
        if (filtered.size() < company.getVideogameList().size()) {
            company.setVideogameList(filtered);
            videogameRepository.deleteById(videogame.getId());
            companyRepository.save(company);
            return true;
        }
        return false;
    }


}
