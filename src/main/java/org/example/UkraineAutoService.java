package org.example;

public class UkraineAutoService extends Work implements NationalExchanger {
    @Override
    public Currency euroToNationalCurrency(Float euros) {
        return new Currency(euros*coefficientEuroToNationalCurrency, "Грн");
    }
    public UkraineAutoService(Integer employees, Float daySalary, Integer days, String country, Float coefficientEuroToNationalCurrency) {
        super(employees, daySalary, days, country, coefficientEuroToNationalCurrency);
    }


}