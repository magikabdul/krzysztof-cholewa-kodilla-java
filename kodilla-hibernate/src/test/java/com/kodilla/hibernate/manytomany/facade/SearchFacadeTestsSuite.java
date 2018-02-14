package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestsSuite {
    @Autowired
    private SearchFacade searchFacade;

    @Test
    public void testFindEmployee() {
        //Given
        searchFacade.addEmployeeForCompany(new Company("Mobotix1"), new Employee("John", "Lars"));
        searchFacade.addEmployeeForCompany(new Company("Mobotix2"), new Employee("Stephanie", "Clarckson"));
        searchFacade.addEmployeeForCompany(new Company("Mobotix3"), new Employee("Linda", "Kovalsky"));

        //When
        try {
            searchFacade.processSearchEmployee("la");
        } catch (SearchException e) {

        }

        //Then

        //CleanUp
        searchFacade.deleteAll();
    }

    @Test
    public void testFindCompany() {
        //Given
        searchFacade.addEmployeeForCompany(new Company("Mobotix1"), new Employee("John", "Smith"));
        searchFacade.addEmployeeForCompany(new Company("Mobotix2"), new Employee("Stephanie", "Clarckson"));
        searchFacade.addEmployeeForCompany(new Company("Mobotix23"), new Employee("Linda", "Kovalsky"));

        //When
        try {
            searchFacade.processSearchCompany("tix2");
        } catch (SearchException e) {

        }

        //Then

        //CleanUp
        searchFacade.deleteAll();
    }
}
