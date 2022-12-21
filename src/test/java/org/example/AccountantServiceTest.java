package org.example;
import org.junit.jupiter.api.*;


public class AccountantServiceTest {
    @Test
    public void countSalaryToPayTest(){

        Work company1 = new RussianAutoService(2, (float) 300, 20, "Russia", (float) 70);
        Work company2 = new UkraineAutoService(4, (float) 350, 15, "Ukraine", (float) 35);

        Currency salary1 = AccountantService.getSalaryToPay(company1, (NationalExchanger) company1);
        Currency salary2 = AccountantService.getSalaryToPay(company2, (NationalExchanger) company2);

        Assertions.assertEquals(salary1.value, 840000);
        Assertions.assertEquals(salary2.value, 735000);
    }
}
