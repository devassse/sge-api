package com.keomagroup.sgs.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.keomagroup.sgs.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
