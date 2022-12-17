package org.example;

import org.junit.jupiter.api.*;

import javax.sound.sampled.LineUnavailableException;

public class BracketsValidationTest {

    @Test
    public void validateRoundBracketsTest(){
        // null & empty option
        String text1 = null;
        String text2 = "";
        Assertions.assertThrows(LineUnavailableException.class, () -> BracketsValidation.validateRoundBrackets(text1));
        Assertions.assertThrows(LineUnavailableException.class, () -> BracketsValidation.validateRoundBrackets(text2));

        // valid option
        String text3 = "(((99haojewo)9hja))((j)-)ha()";
        Assertions.assertDoesNotThrow(() -> BracketsValidation.validateRoundBrackets(text3));

        // invalid option
        String text4 = "(((A)()_(_)(GA-ga-gegg0sg0es-_)____-h90-a";
        Assertions.assertThrows(Exception.class, () -> BracketsValidation.validateRoundBrackets(text4));
    }

    @Test
    public void validateAllBracketsTest(){
        // null & empty option
        String text1 = null;
        String text2 = "";
        Assertions.assertThrows(LineUnavailableException.class, () -> BracketsValidation.validateRoundBrackets(text1));
        Assertions.assertThrows(LineUnavailableException.class, () -> BracketsValidation.validateRoundBrackets(text2));

        // valid option
        String text3 = "<dfoihahog-ah[a-[hre]]-iar{}((ho><))>";
        Assertions.assertDoesNotThrow(() -> BracketsValidation.validateAllBrackets(text3));

        // invalid option
        String text4 = "PASP((((((((((((((((((((F}SA}PFAP}A{g][ew[]gew[]g[]w[))((<>";
        Assertions.assertThrows(Exception.class, () -> BracketsValidation.validateAllBrackets(text4));

    }


}
