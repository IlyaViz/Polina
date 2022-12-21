package org.example;

public class Work {
    Integer employees;
    Float daySalary;
    Integer days;
    String country;
    Float coefficientEuroToNationalCurrency;
    public Work(Integer employees, Float daySalary, Integer days, String country, Float coefficientEuroToNationalCurrency){
        this.employees = employees;
        this.daySalary = daySalary;
        this.days = days;
        this.country = country;
        this.coefficientEuroToNationalCurrency = coefficientEuroToNationalCurrency;
    };
}
