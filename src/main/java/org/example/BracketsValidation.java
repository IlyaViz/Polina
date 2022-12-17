package org.example;

import javax.sound.sampled.LineUnavailableException;
import java.util.*;

public class BracketsValidation {

    private static boolean textHasOneOrMoreCharacters(String text){
        if(text == null || text.length() == 0){
            return false;
        }
        return true;
    }

    public static void validateRoundBrackets(String text) throws Exception {

        if (!textHasOneOrMoreCharacters(text)){
            throw new LineUnavailableException("Invalid text");
        }

        char[] chars = text.toCharArray();
        int rightBrackets = 0;

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '('){
                rightBrackets += 1;
            } else if(chars[i] == ')'){
                if(rightBrackets == 0){
                    throw new Exception("Brackets errors");
                }
                else{
                    rightBrackets -= 1;
                }
            }
        }
        if(rightBrackets != 0){
            throw new Exception("Brackets errors");
        }
    }
    public static void validateAllBrackets(String text) throws Exception{

        if (!textHasOneOrMoreCharacters(text)){
            throw new LineUnavailableException("Invalid text");
        }

        var chars = text.toCharArray();

        var bracketsMap = new HashMap<Character, Map>(Map.of(
                '(', new HashMap<>(Map.of("count", 0)),
                '<', new HashMap<>(Map.of("count", 0)),
                '{', new HashMap<>(Map.of("count", 0)),
                '[', new HashMap<>(Map.of("count", 0)),
                ')', new HashMap<>(Map.of("pair", '(')),
                '>', new HashMap<>(Map.of("pair", '<')),
                '}', new HashMap<>(Map.of("pair", '{')),
                ']', new HashMap<>(Map.of("pair", '['))));

        ArrayList<Character> bracketsFromText = new ArrayList<Character>();

        for(Character character : chars){
            if(bracketsMap.containsKey(character)){
                bracketsFromText.add(character);
            }
        }

        for(Character bracket : bracketsFromText){
            if(bracketsMap.get(bracket).containsKey("count")){
                bracketsMap.get(bracket).put("count", (int) bracketsMap.get(bracket).get("count") + 1);
            } else{
                char rightPairOfBracket = (char) bracketsMap.get(bracket).get("pair");
                bracketsMap.get(rightPairOfBracket).put("count", (int)bracketsMap.get(rightPairOfBracket).get("count") - 1);
                if ( (int) bracketsMap.get(rightPairOfBracket).get("count") < 0) {
                    throw new Exception("Invalid brackets; Problem with bracket : " + rightPairOfBracket);
                }
            }
        }

        for(Character bracket : bracketsMap.keySet()) {
            Object countOfBracket = bracketsMap.get(bracket).get("count");
            try {
                if ((int) countOfBracket != 0) {
                    throw new Exception("Invalid brackets; Problem with" + bracket);
                }
            } catch (NullPointerException e) {

            }
        }

    }
}
