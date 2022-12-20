package org.example;

public class UkraineAutoService implements Company{
    Integer employess;
    Integer daySalary;
    Integer days;

    @Override
    public Integer countSalary() {
        return employess*daySalary*days;
    }
    public UkraineAutoService(Integer employess, Integer daySalary, Integer days){
        this.employess = employess;
        this.daySalary = daySalary;
        this.days = days;
    }
}