package com.guli.mac_base.Repository;

import com.guli.mac_base.Model.Company;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
