package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {
    public static final String ERR_EMPLOYEE_NOT_FOUND = "No matching entries in Employee data base";
    public static final String ERR_COMPANY_NOT_FOUND = "No matching entries in Company data base";

    public SearchException(String message) {
        super(message);
    }
}
