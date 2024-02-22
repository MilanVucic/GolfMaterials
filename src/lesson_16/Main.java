package lesson_16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 958 -> 95
        // arr1 -> 11, 125, 19, 1100
        // arr2 -> 23, 2, 205, 2905232
        // 95523 -> 95
        // 10 million -> 0.5 mil starting with A
        // HISTORY A -> 5000

        // QWXY -> Yverson
        // L -> Lindl
        // M
        // JH -> Heidn, Jacobson
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 7, 8, 9));
        Set<String> set3 = new HashSet<>(Arrays.asList("Milan", "Marco"));
        Set<String> set4 = new HashSet<>(Arrays.asList("Marco", "Lisa"));
        System.out.println(symmetricDifference(set1, set2));
        System.out.println(symmetricDifference(set3, set4));
    }

    private static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        union.removeAll(intersection);
        return union;
    }

    private static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        set1.addAll(set2);
        return set1;
    }

    private static Set<Integer> intersection(Integer[] arr1, Integer[] arr2) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        set1.retainAll(set2);
        return set1;
    }

    private static Set<Integer> intersectionWithoutSets(int[] numbers1, int[] numbers2) {
        // Find the intersection of 2 arrays.
        // O(N^2)
        Set<Integer> intersection = new HashSet<>();
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    intersection.add(numbers1[i]);
                    break;
                }
            }
        }
        return intersection;
    }

    private static void setsBasicExamples() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(5);
        set.remove(3);
        System.out.println(set.contains(3));
        System.out.println(set.contains(5));
        System.out.println(set);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number == 1) {
                iterator.remove();
            }
            System.out.println(number);
        }

        Set<Integer> copy = new HashSet<>(set);
        for (Integer number : copy) {
            if (number == 1) {
                set.remove(1);
            }
            System.out.println(number);
        }
        System.out.println(set);
    }
}
