package com.example.business.controller;

import com.example.business.model.Branch;
import com.example.business.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchRepository repository;

    @PostMapping
    public Branch addCompany(@RequestBody Branch branch){
        return repository.save(branch);

    }

    @GetMapping()
    public List<Branch> getAllBranch(){
        return repository.findAll();
    }




}
