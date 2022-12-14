package org.example;

import java.security.KeyException;

import java.util.Map;

public class PrimitiveDataTypes {
    public static void getEachPrimitiveInfo(){
        System.out.println( "byte: whole numbers from -128 to 127\n" +
                            "short: whole numbers from -32768 to 32767\n" +
                            "int: whole numbers from -2.147.483.648 to 2.147.483.647\n" +
                            "long: whole numbers from -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807\n" +
                            "float: numbers with up to 7 digits after comma\n" +
                            "double: numbers with up to 15 digits after comma\n" +
                            "boolean: stores true or false\n" +
                            "char: stores single character/letter/ASCII value"
        );
    }
    public static void getPrimitiveInfo(String primitive) throws KeyException{
        Map<String, String> primitivesDict = Map.of(
                "byte", "whole numbers from -128 to 127\n",
                "short","whole numbers from -32768 to 32767\n",
                "int","whole numbers from -2.147.483.648 to 2.147.483.647\n",
                "long","whole numbers from -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807\n",
                "float","numbers with up to 7 digits after comma\n",
                "double","numbers with up to 15 digits after comma\n",
                "boolean","stores true or false\n",
                "char", "stores single character/letter/ASCII value\n"
        );

        String lowercasePrimitive = primitive.toLowerCase();
        String info = primitivesDict.get(lowercasePrimitive);
        if(info != null){
            System.out.println(info);
        } else{
            throw new KeyException("this primitive doesn't exist");
        }
    }
}
