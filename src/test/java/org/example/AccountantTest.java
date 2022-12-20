package org.example;
import org.junit.jupiter.api.*;


public class AccountantTest {
    @Test
    public void countSalaryToPayTest(){

        Company company1 = new RussianAutoService(2,300,20);
        Company company2 = new UkraineAutoService(4,350,15);

        Integer payment1 = Accountant.countSalaryToPay(company1);
        Integer payment2 = Accountant.countSalaryToPay(company2);

        Assertions.assertEquals(payment1, 12000);
        Assertions.assertEquals(payment2, 21000);
    }
}
