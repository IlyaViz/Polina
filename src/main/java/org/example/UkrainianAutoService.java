package org.example;

public class UkrainianAutoService extends Company implements SalaryConverter {

    @Override
    public Currency euroToNationalCurrency(Float euros) {
        return new Currency(euros*35, "Грн");
    }

    public UkrainianAutoService(WorkForce workForce) {
        super(workForce);
    }



}