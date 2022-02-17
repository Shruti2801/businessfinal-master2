package com.example.business.repository;

import com.example.business.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {
//    List<Student> findByName(String name);
}
