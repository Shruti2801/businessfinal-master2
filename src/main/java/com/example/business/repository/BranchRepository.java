package com.example.business.repository;

import com.example.business.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch,Integer> {
}
