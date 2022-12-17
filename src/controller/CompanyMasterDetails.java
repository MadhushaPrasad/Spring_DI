package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import type.type01.constructorBasedDI.bean.EmployeeMasterDetails;

@RestController
public class CompanyMasterDetails {
    private EmployeeMasterDetails employeeMasterDetails;

    @Autowired
    public CompanyMasterDetails(EmployeeMasterDetails employeeMasterDetails) {
        this.employeeMasterDetails = employeeMasterDetails;
    }

    @Override
    public String toString() {
        return "CompanyMasterDetails{" +
                "employeeMasterDetails=" + employeeMasterDetails +
                '}';
    }

    @Autowired
    public void setEmployeeMasterDetails(EmployeeMasterDetails employeeMasterDetails) {
        this.employeeMasterDetails = employeeMasterDetails;
    }
}

