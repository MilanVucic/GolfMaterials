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

        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi non urna eu nunc ullamcorper ultrices. Pellentesque ac tincidunt nunc. Praesent ipsum ex, tincidunt vel fermentum sit amet, suscipit at nibh. Aenean nec augue iaculis, facilisis odio eu, sodales enim. Nunc imperdiet metus ut neque dapibus lacinia. Nam quis arcu accumsan, semper nisi eget, rutrum tortor. Proin sit amet luctus orci, eu ornare neque. Nulla dapibus ligula neque, eu mattis felis sodales et.\n" +
                "\n" +
                "Praesent pretium, ligula ac lobortis fringilla, metus risus dignissim orci, nec vestibulum nisl sem sed dolor. Duis vitae efficitur nisi, pharetra dignissim sem. Phasellus faucibus ac purus vel accumsan. Donec ultrices est ut turpis tempor, id laoreet urna blandit. In leo justo, elementum ut posuere at, pretium id nisl. Morbi tempor convallis elit, vitae elementum tellus condimentum eu. Aliquam non lacus quis libero fringilla fringilla ut at sapien. Sed commodo, nibh eget ullamcorper eleifend, odio odio ullamcorper arcu, sed semper augue neque a eros. Nulla a arcu eget ante vulputate elementum. Donec in scelerisque tortor. Etiam semper erat nec lacus dapibus vehicula. Donec quis urna justo.\n" +
                "\n" +
                "Sed et risus id orci sagittis auctor. Ut vel dignissim augue. Mauris vel arcu a magna tristique sollicitudin. Ut dapibus porta velit, ut efficitur erat mattis eget. Suspendisse non mauris non massa tincidunt tempus ut in orci. Mauris odio nisl, posuere et tellus vitae, porttitor molestie ligula. Ut facilisis mollis turpis. Proin tincidunt dolor quis rutrum elementum. Mauris ultrices ut quam et egestas. Morbi id accumsan nisl, et tempus eros. Suspendisse hendrerit tellus diam, eu pharetra massa mattis non. Duis eleifend imperdiet luctus.\n" +
                "\n" +
                "Ut viverra, justo vel fermentum malesuada, nulla nunc cursus dui, id posuere tellus libero in metus. Cras laoreet turpis vel mauris dapibus placerat. Sed porta et est non tincidunt. Pellentesque consequat elementum sagittis. Duis magna nunc, cursus sed turpis vitae, convallis tristique tellus. Morbi eget nulla a magna scelerisque sagittis. Duis efficitur a ipsum id placerat. Maecenas nisi lacus, tincidunt at euismod eget, tincidunt quis tellus.\n" +
                "\n" +
                "Mauris ac scelerisque dui. Nulla facilisi. In hac habitasse platea dictumst. Nam hendrerit accumsan magna at viverra. Donec ac lacus ante. Nullam ut nibh vitae arcu gravida tincidunt. Etiam gravida euismod ante, at congue magna molestie at. Suspendisse porta quam vitae erat volutpat suscipit. Sed et libero sed turpis suscipit placerat.";
        Map<Integer, List<String>> map = getWordsByFrequency(
                getWordFrequency(input));
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
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            word = word.replaceAll("[^\\p{IsAlphabetic}]", "");
            word = word.toLowerCase(); // This, this
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