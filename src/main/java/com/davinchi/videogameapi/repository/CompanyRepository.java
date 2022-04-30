package com.davinchi.videogameapi.repository;

import com.davinchi.videogameapi.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
