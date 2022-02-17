package com.example.business.controller;

import com.example.business.model.Company;
import com.example.business.repository.ProductRepository;
import com.example.business.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyRepository repository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Company addCompany(@RequestBody Company student){
        return repository.save(student);

    }

    @GetMapping()
    public List<Company> getAllCompany(){
        return repository.findAll();
    }

}









//    @ResponseBody
//    public List<Student> details(@RequestParam("id")Integer id,@RequestParam("name") String name,@RequestParam("logo") String logo
//            ,@RequestParam("product") List<String> product,@RequestParam("services") List<String> services){
////        return "ID" +id+"Name :"+name+"Product" +product +services +"Logo" +logo;
//
//        return repository.findByName(name);
//    }
//
//    @RequestMapping(value = "/makeAction")
//    public String makeLoan(@RequestParam("loan_id")int loan_id,
//                           @RequestParam("clientName")String clientName,
//                           @RequestParam("clientSurname")String clientSurname,
//                           @RequestParam("amount")double amount,
//                           @RequestParam("days")int days ) throws Exception {
//        return repository.makeAction(loan_id,clientName,clientSurname,amount,days);
//    }
