package com.guli.mac_base.Controller;

import com.guli.mac_base.Service.CompanyServices;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/Company")
@RestController
public class CompanyController {

    private CompanyServices companyServices;

    public CompanyController(CompanyServices companyServices) {
        this.companyServices = companyServices;
    }

    @PostMapping("/addCompany")
    public void addComapany(@RequestParam String companyName, @RequestParam long macBlock){
        companyServices.addCompany(companyName, macBlock);
    }
}
