package com.keomagroup.sgs.repositories;

import com.keomagroup.sgs.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
