package org.example;

public class Task5 {
    static class SentenceStats {
        int spaces;
        int consonants;
        int vowels;

        public SentenceStats(int spaces, int consonants, int vowels) {
            this.spaces = spaces;
            this.consonants = consonants;
            this.vowels = vowels;
        }

        @Override
        public String toString() {
            return "Spaces: " + spaces + ", Consonants: " + consonants + ", Vowels: " + vowels;
        }
    }

    public static SentenceStats analyzeSentence(String sentence) {
        int spaceCount = 0;
        int consonantCount = 0;
        int vowelCount = 0;

        for (char c : sentence.toLowerCase().toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            } else if (isVowel(c)) {
                vowelCount++;
            } else if (isConsonant(c)) {
                consonantCount++;
            }
        }

        return new SentenceStats(spaceCount, consonantCount, vowelCount);
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) >= 0;
    }

    private static boolean isConsonant(char c) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(c) >= 0;
    }

    public static void main(String[] args) {
        String sentence = "Hello, how do u do?";
        SentenceStats stats = analyzeSentence(sentence);
        System.out.println(stats);
    }
}
