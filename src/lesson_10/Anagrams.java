package lesson_10;

import java.util.Arrays;

public class Anagrams {

    // Check if 2 strings are anagrams of each other (below - elbow)
    // abbcd <-> bbcad <-> bacdb
    public static void main(String[] args) {
        System.out.println(areAnagramsUsingSort("elbow", "below"));
        System.out.println(areAnagramsUsingSort("abbcd", "bacdb"));
        System.out.println(areAnagramsUsingSort("abbcd", "bxacdb"));
        System.out.println(areAnagramsUsingSort("abbbcd", "bacdb"));
        System.out.println(areAnagrams("elbow", "below"));
        System.out.println(areAnagrams("abbcd", "bacdb"));
        System.out.println(areAnagrams("abbcd", "bxacdb"));
        System.out.println(areAnagrams("abbbcd", "bacdb"));

//        int[] numbers = new int[1000];
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers.length; j++) {
//                for (int k = 0; k < ; k++) {
//                    // O(n^3)
//                }
//            }
//        }
//        for (int i = 0; i < numbers.length; i++) {
//
//        } // O(n*log(n))
        // log10 (1000) = 3
        // log10 (100) = 2
        // log10 (10) = 1
        // log10 (20) = 1.1
        // log10 (30) = 1.15
        // log10 (40) = 1.19
    }

    private static boolean areAnagramsUsingSort(String word1, String word2) {
        char[] word1Letters = word1.toCharArray();
        char[] word2Letters = word2.toCharArray();
        Arrays.sort(word1Letters);
        Arrays.sort(word2Letters);
        return Arrays.equals(word1Letters, word2Letters);
    }

    private static boolean areAnagrams(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int[] letterDiff = new int[26]; // 0 0 0 0 0 0

        // a b c b, b c b a
        // 0 0 0
        for (int i = 0; i < word1.length(); i++) {
            char w1Letter = word1.charAt(i); // a
            char w2Letter = word2.charAt(i); // b
            letterDiff[w1Letter - 'a']++;
            letterDiff[w2Letter - 'a']--;
            // a -> 0
            // b -> 1
            // c -> 2
            // .. z -> 25
            // f (77), a (72) -> f goes into 77-72 = 5
        }

        for (int i = 0; i < letterDiff.length; i++) {
            if (letterDiff[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
