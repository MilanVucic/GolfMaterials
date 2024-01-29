package lesson_10;

public class LongestPrefix {
    // In a given array of Strings, find the longest common prefix.
    // {apple, application, ape} -> return "ap"
    // {apple, application, ape, adam} -> return "a"
    // {apple, application, appliance} -> return "appl"

    public static void main(String[] args) {
        System.out.println(getLongestCommonPrefix
                (new String[]{"apple", "application", "appliance"}));
        System.out.println(getLongestCommonPrefix
                (new String[]{"apple", "application", "ape"}));
        System.out.println(getLongestCommonPrefix
                (new String[]{"apple", "application", "ape", "adam"}));
        System.out.println(getLongestCommonPrefix
                (new String[]{"zapple", "application", "ape", "adam"}));
        System.out.println(getLongestCommonPrefix
                (new String[]{"apple", "appl"}));
        System.out.println(getLongestCommonPrefix
                (new String[]{"something", "some", "so"}));
    }

    private static String getLongestCommonPrefix(String[] words) {
        String firstWord = words[0];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            char firstWordLetter = firstWord.charAt(i);
            for (int j = 1; j < words.length; j++) {
                if (words[j].length() == i || firstWordLetter != words[j].charAt(i)) {
                    return result.toString();
                }
            }
            result.append(firstWordLetter);
        }
        return result.toString();
    }
}
