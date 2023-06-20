package com.keomagroup.sgs.services;

import com.keomagroup.sgs.entities.Company;
import com.keomagroup.sgs.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository repository;

    public List<Company> listAll(){
        return repository.findAll();
    }

    public void save(Company company){
        repository.save(company);
    }

    public Company get(int id){
        return repository.findById(id).get();
    }

    public void delete(int id){
        repository.deleteById(id);
    }

}
