package org.example;

public class Task3_1 {

    public static boolean areRotations(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int length = str1.length();

        for (int i = 0; i < length; i++) {

            boolean match = true;
            for (int j = 0; j < length; j++) {

                if (str1.charAt((i + j) % length) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        if (areRotations(str1, str2)) {
            System.out.println("Strings are rotations");
        } else {
            System.out.println("Strings are not rotations");
        }
    }
}
