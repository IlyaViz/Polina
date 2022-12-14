package org.example;

import org.junit.jupiter.api.*;

public class BracketsValidationTest {

    @Test
    public void validateRoundBracketsTest(){
        String text = "(((99haojewo)9hja))((j)-)ha()";
        Assertions.assertDoesNotThrow(() -> BracketsValidation.validateRoundBrackets(text));

        String text1 = "(((A)()_(_)(GA-ga-gegg0sg0es-_)____-h90-a";
        Assertions.assertThrows(Exception.class, () -> BracketsValidation.validateRoundBrackets(text1));
    }

    @Test
    public void validateAllBracketsTest(){
        String text = "<dfoihahog-ah[a-[hre]]-iar{}((ho><))>";
        Assertions.assertDoesNotThrow(() -> BracketsValidation.validateAllBrackets(text));

        String text1 = "PASP((((((((((((((((((((F}SA}PFAP}A{g][ew[]gew[]g[]w[))((<>";
        Assertions.assertThrows(Exception.class, () -> BracketsValidation.validateAllBrackets(text1));

    }


}
