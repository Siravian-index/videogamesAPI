package com.davinchi.videogameapi.controller;

import com.davinchi.videogameapi.entity.Company;
import com.davinchi.videogameapi.service.CompanyServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/companies")
public class CompanyController {

    private final CompanyServiceImplementation companyService;

    @Autowired
    public CompanyController(CompanyServiceImplementation companyService) {
        this.companyService = companyService;
    }
    @GetMapping
    List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @PostMapping
    Company createCompany(@RequestBody Company company) {
        return companyService.createCompany(company);
    }

    @DeleteMapping
    public void deleteCompany(@RequestBody Company company) {
        companyService.deleteCompany(company);
    }

}
