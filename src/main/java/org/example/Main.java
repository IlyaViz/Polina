package org.example;

import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        String text = "((()))";
        validateBrackets(text);
        System.out.println(text);

    }

    private static void validateBrackets(String a) throws Exception {
        char[] chars = a.toCharArray();
        int rightBrackets = 0;

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '('){
                rightBrackets += 1;
            } else if(chars[i] == ')'){
                if(rightBrackets == 0){
                    throw new Exception("Huina peredelavay");
                }
                else{
                    rightBrackets -= 1;
                }
            }

        }
        if(rightBrackets != 0){
            throw new Exception("Huina peredelavay");
        }

    }

}