package lesson_17;

import java.util.*;

public class Main {

    // Additional HW:
//    Find the word that repeats most times in a given String.

    public static void main(String[] args) {

        // this is an example input this is an this
        // 3 -> this
        // 2 -> is, an
        // 1 -> example, input

        Map<Integer, List<String>> map = getWordsByFrequency(
                getWordFrequency("this this this is an example example input this is an this"));
        for (Integer key : map.keySet()) {
            System.out.println(key +" -> " + map.get(key));
        }
    }

    // Our input looks something like this:
    // input -> 1
    // is -> 2
    // an -> 2
    // this -> 3
    // example -> 1
    // We want our output to look something like this:
    // 3 -> [this]
    // 2 -> is, an
    // 1 -> example, input
    private static SortedMap<Integer, List<String>> getWordsByFrequency(Map<String, Integer> wordMap) {
        SortedMap<Integer, List<String>> map = new TreeMap<>(new DescendingIntegerComparator());

        for (String word : wordMap.keySet()) {
            int repeatCount = wordMap.get(word);
            List<String> list;
            if (map.containsKey(repeatCount)) {
                list = map.get(repeatCount);
            } else {
                list = new ArrayList<>();
            }
            list.add(word);
            map.put(repeatCount, list);
        }
        return map;
    }

    private static Map<String, Integer> getWordFrequency(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }

    private static List<Character> getMostOccurringCharacter(String sentence) {
        Map<Character, Integer> letterMap = getLetterFrequency(sentence);

        int max = -1;
        // aabbccdddeeekk
        // result: d,e
        List<Character> result = new ArrayList<>();
        for (Character character : letterMap.keySet()) {
            int numOfOccurrences = letterMap.get(character);
            if (numOfOccurrences > max) {
                result.clear();
                max = numOfOccurrences;
                result.add(character);
            } else if (numOfOccurrences == max) {
                result.add(character);
            }
        }
        return result;
    }

    private static Map<Character, Integer> getLetterFrequency(String sentence) {
        Map<Character, Integer> map = new HashMap<>();
        // aabbc
        // a -> 2
        // b -> 2
        // c -> 1
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if (map.containsKey(letter)) {
                int oldCount = map.get(letter);
                map.put(letter, oldCount + 1);
            } else {
                map.put(letter, 1);
            }
        }
        return map;
    }

    private static void mapsExample() {
        String[] arr = new String[]{"1", "1", "3", "4"};
        arr[1] = "Milan";
        // 0 -> "1"
        // 1 -> "Milan"
        System.out.println(arr[2]);
        List<String> list = new ArrayList<>();
        list.add("asd");
        list.get(0);

        Map<Integer, String> map = new HashMap<>();
        map.put(5, "Milan"); // 5 -> Milan
        map.put(10, "something"); // 10 -> something
        map.put(11, "data"); // 10 -> something
        map.put(12, "data"); // 10 -> something
        System.out.println(map.size());
        map.put(10, "some string"); // 10 -> something
        map.remove(5);

        System.out.println(map.get(5));
        System.out.println(map.get(10));
        System.out.println(map.size());

        System.out.println("Map:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println(map);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private static void sortedMapExample() {
        SortedMap<Integer, String> map = new TreeMap<>(new DescendingIntegerComparator());
        map.put(-110, "milan");
        map.put(1, "marco");
        map.put(15, "sarah");
        map.put(7, "luca");
        map.put(8, "luca");
        map.put(4, "luca");
        map.put(3, "luca");
        System.out.println(map);
        for (Integer integer : map.keySet()) {
            System.out.println(integer + " -> " + map.get(integer));
        }
    }

}