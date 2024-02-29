package lesson_18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Stack
        // LIFO - Last In First Out

        System.out.println(areBracketsPaired("()][()")); // false
        System.out.println(areBracketsPaired("[(])")); // false
        System.out.println(areBracketsPaired("[({}])")); // false
        System.out.println(areBracketsPaired("()[{}]")); // true
        System.out.println(areBracketsPaired("{()[()]}[{(()[])}]")); // true
    }

    // Check if the brackets are properly paired ([{}])
    // ()[{}] -> return true
    // {[]() -> return false
    // )( -> false
    // (+1 )-1
    // ())
    // [({}]) -> false
    // [({} ] )
    // Stack: [( -> return false
    // we return true only if the stack is empty at the end
    // ((){[]})
    // Stack: return true
    // {[{}
    private static boolean areBracketsPaired(String expression) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(']', '[');
        brackets.put('}', '{');
        brackets.put(')', '(');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char letter = expression.charAt(i);
            if (letter == '[' ||letter == '(' ||letter == '{') {
                stack.push(letter);
            } else if (letter == ']' ||letter == ')' ||letter == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char stackTop = stack.peek();
                if (stackTop != brackets.get(letter)) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    // Remove pairs of adjacent letters like: afghhgfdds -> afggfs -> affs -> as
    private static String compactWord(String input) {
        // O (N) memory usage
        // O (N) speed
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (stack.isEmpty()) {
                stack.push(letter);
            } else {
                if (stack.peek() == letter) {
                    stack.pop();
                } else {
                    stack.push(letter);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }

    private static void queues() {
        // FIFO -> First In First Out
        // 2 3 5 7 2 3 7
        // 4 3 2 1
        // Fix laptop 3, Fix servers 3, Bring coffee 1, take the trash out 1, here 1
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o2.getPriority() - o1.getPriority();
            }
        });

        priorityQueue.add(new Task("Bring newspaper", "", 1));
        priorityQueue.add(new Task("Clean the washer", "", 1));
        priorityQueue.add(new Task("Check the servers", "", 2));
        priorityQueue.add(new Task("Fix laptop", "", 3));
        priorityQueue.add(new Task("Send the email", "", 2));

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
    }
}
