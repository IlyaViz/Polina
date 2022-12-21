package org.example;

public class RussianAutoService extends Work implements NationalExchanger {
    @Override
    public Currency euroToNationalCurrency(Float euros) {
        return new Currency(euros*coefficientEuroToNationalCurrency, "Руб");
    }
    public RussianAutoService(Integer employees, Float daySalary, Integer days, String country, Float coefficientEuroToNationalCurrency) {
        super(employees, daySalary, days, country, coefficientEuroToNationalCurrency);
    }



}
