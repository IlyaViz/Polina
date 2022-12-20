package org.example;

public class RussianAutoService implements Company{
    Integer employess;
    Integer daySalary;
    Integer days;

    @Override
    public Integer countSalary() {
        return employess*daySalary*days;
    }

    public RussianAutoService(Integer employess, Integer daySalary, Integer days){
        this.employess = employess;
        this.daySalary = daySalary;
        this.days = days;
    }
}
