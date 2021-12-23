package com.learning.datastructure.algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Target {

    public static void getCountCharacter(String input){
        Map<Character,Integer> countMap= new HashMap<>();
        char[] inputChars = input.toCharArray();

        for(char c: inputChars){
            if(countMap.containsKey(c))
                countMap.put(c,countMap.get(c)+1);
            else
                countMap.put(c,1);
        }
        Set<Map.Entry<Character, Integer>> entries = countMap.entrySet();
        for(Map.Entry e: entries){
            System.out.println("Character: "+e.getKey()+" occurs: "+e.getValue());
        }

    }

    public static void main(String[] args) {
        getCountCharacter("ABCCHGGDDDER");
    }

}
