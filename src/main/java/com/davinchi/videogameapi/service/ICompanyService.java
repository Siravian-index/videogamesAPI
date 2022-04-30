package com.davinchi.videogameapi.service;

import com.davinchi.videogameapi.entity.Company;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ICompanyService {
    List<Company> getAllCompanies();
    Company createCompany(Company company);
    void deleteCompany(Company company);
}
