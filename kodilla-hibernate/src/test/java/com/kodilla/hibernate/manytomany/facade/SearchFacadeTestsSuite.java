package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

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
        List<Employee> list = new ArrayList<>();
        try {
            list = searchFacade.processSearchEmployee("la");
        } catch (SearchException e) {

        }

        //Then
        Assert.assertEquals(2, list.size());

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
        List<Company> list = new ArrayList<>();
        try {
            list = searchFacade.processSearchCompany("otix");
        } catch (SearchException e) {

        }

        //Then
        Assert.assertEquals(3, list.size());

        //CleanUp
        searchFacade.deleteAll();
    }
}
