package org.example;

public class AccountantService {
    public static Currency getSalaryToPay(Work workData, NationalExchanger company){
        Float sum = workData.days*workData.daySalary*workData.employees;
        Currency money = company.euroToNationalCurrency(sum);
        return money;
    }
}
