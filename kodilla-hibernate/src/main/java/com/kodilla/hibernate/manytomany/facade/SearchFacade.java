package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SearchFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private final static Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public void addEmployeeForCompany(Company company, Employee employee) {
        company.getEmployees().add(employee);
        employee.getCompanies().add(company);
        companyDao.save(company);
    }

    public void deleteAll() {
        companyDao.deleteAll();
    }

    public void processSearchEmployee(String searchKey) throws SearchException {
        String sKey = "%" + searchKey + "%";

        LOGGER.info("Searching for employees matching to searching criteria: " + sKey);
        List<Employee> list = employeeDao.findMatching(sKey);

        if (list.size() < 1) {
            LOGGER.error("No matching entries for search criteria");
            throw new SearchException(SearchException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            LOGGER.info("List of matching entries");
            int idx = 1;
            for (Employee employee: list) {
                LOGGER.info(idx + ". " + employee.getLastName() + " " + employee.getFirstName());
                idx++;
            }
        }
    }

    public void processSearchCompany(String searchKey) throws SearchException {
        String sKey = "%" + searchKey + "%";

        LOGGER.info("Searching for company matching to searching criteria: " + sKey);
        List<Company> list = companyDao.findMatching(sKey);

        if (list.size() < 1) {
            LOGGER.error("No matching entries for search criteria");
            throw new SearchException(SearchException.ERR_COMPANY_NOT_FOUND);
        } else {
            LOGGER.info("List of matching entries");
            int idx = 1;
            for (Company company: list) {
                LOGGER.info(idx + ". " + company.getName());
                idx++;
            }
        }
    }
}
