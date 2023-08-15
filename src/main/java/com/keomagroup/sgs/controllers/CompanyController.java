package com.keomagroup.sgs.controllers;

import com.keomagroup.sgs.entities.Company;
import com.keomagroup.sgs.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/company")
    public List<Company> list(){
        return companyService.listAll();
    }

    @GetMapping("/company/{id}")
    public ResponseEntity<Company> get(@PathVariable int id) {
        try {
            Company company = companyService.get(id);
            return new ResponseEntity<Company>(company, HttpStatus.OK);
        } catch (NoSuchElementException ex){
            System.out.println("Error Getting Company With ID " + id);
            return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/company")
    public void add(@RequestBody Company company) {

        System.out.println("Dados da Empresa" + company);

        companyService.save(company);
    }

    @PutMapping("/company/{id}")
    public ResponseEntity<?> update(@RequestBody Company company, @PathVariable int id){
        try{
            Company existCompany = companyService.get(id);
            companyService.save(existCompany);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            System.out.println("Error Updating Company With ID " + id);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/company/{id}")
    public ResponseEntity<Company> delete(@PathVariable int id){
        try{
            companyService.delete(id);
            return new ResponseEntity<Company>(HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            System.out.println("Error Deleting Company With ID " + id);
            return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
        }
    }
}
