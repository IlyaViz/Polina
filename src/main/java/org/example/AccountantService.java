package org.example;

public class AccountantService {

    Company company;
    SalaryConverter companySalaryConverter;

    public AccountantService(Company company, SalaryConverter companySalaryConverter){
        this.company = company;
        this.companySalaryConverter = companySalaryConverter;
    }

    public Currency getSalaryToPay(){
        Float sum = company.workForce.workingDays * company.workForce.daySalary * company.workForce.participants;
        Currency money = companySalaryConverter.euroToNationalCurrency(sum);
        return money;

    }
}
