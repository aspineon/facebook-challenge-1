package com.company;
import java.util.Map;
import java.util.HashMap;


public class Decode {
    String string;
    HashMap<String, Integer> decode = new HashMap<String, Integer>();

    if( char letter=64 ; letter > 63 && letter < 274 ; letter++){
        System.out.println("%d = %c\n", (int)letter, letter);
        if(int j=0 ; j< 26 ; j++ ){
            decode.put(letter , j);
        }
    }

}
