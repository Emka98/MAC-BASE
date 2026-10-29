package com.guli.mac_base.Service;

import com.guli.mac_base.Model.Company;
import com.guli.mac_base.Repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyServices {

    private final CompanyRepository companyRepository;

    public CompanyServices(CompanyRepository companyRepository) {

        this.companyRepository = companyRepository;
    }

    public void addCompany(String name, long macBlock){

    }

}
