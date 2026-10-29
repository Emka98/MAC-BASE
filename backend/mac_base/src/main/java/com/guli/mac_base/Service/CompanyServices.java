package com.guli.mac_base.Service;

import com.guli.mac_base.Model.Company;
import com.guli.mac_base.Repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyServices {

    private CompanyRepository companyRepository = new CompanyRepository();

    public CompanyServices(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public void addCompany(String name, long macBlock){
        Company company = new Company();
        company.setNameCompany(name);
        company.addBlockToSet(macBlock);
        this.companyRepository.save(company);
    }

}
