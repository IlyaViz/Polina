package org.example;
import org.junit.jupiter.api.*;


public class AccountantServiceTest {
    @Test
    public void getSalaryToPayTest(){


        Company russianCompany = new RussianAutoService(new WorkForce(2, (float) 300, 20));
        Company ukrainianCompany = new UkrainianAutoService(new WorkForce(4, (float) 350, 15));

        AccountantService russianAutoServiceAccountantService = new RussianAutoServiceAccountantService(russianCompany,
                                                                                            (SalaryConverter) russianCompany);
        AccountantService ukrainianAutoServiceAccountService = new UkrainianAutoServiceAccountantService(ukrainianCompany,
                                                                                            (SalaryConverter) ukrainianCompany);

        Assertions.assertEquals(840000, russianAutoServiceAccountantService.getSalaryToPay().value);
        Assertions.assertEquals(735000, ukrainianAutoServiceAccountService.getSalaryToPay().value);
    }
}
