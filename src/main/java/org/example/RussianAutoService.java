package org.example;

public class RussianAutoService extends Company implements SalaryConverter {

    @Override
    public Currency euroToNationalCurrency(Float euros) {
        return new Currency(euros*70, "Руб");
    }

    public RussianAutoService(WorkForce workForce) {
        super(workForce);
    }


}
