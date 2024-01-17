package org.example;

import java.util.HashMap;

public class Task4 {

    public static char firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();


        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }


        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }


        throw new RuntimeException("No found");
    }

    public static void main(String[] args) {
        String str = "aabbccdefasdafgasfavcafsfdasfdasfasf";
        try {
            char result = firstNonRepeatingChar(str);
            System.out.println("The first non-repeating: " + result);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
