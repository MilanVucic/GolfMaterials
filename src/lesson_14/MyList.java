package lesson_14;

public class MyList<T>{
    private Node<T> head;

    public void add(T value) {
        Node<T> element = new Node<>(value); // 1 5 20 30 -> null, new elem = 10
        if (head == null) {
            head = element;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = element;
        }
    }

    // todo Implement inserting an element at position
    // Example  1 2 3 4 5, insert 10 at 3
    // End result: 1 2 3 10 4 5
    // Insert 5 at index 0
    // End result 5 1 2 3 10 4 5
    public void insert(T element, int index) {

    }

    public T get(int index) {
        Node<T> temp = head;
        int counter = 0;
        while (temp != null) {
            if (counter == index) {
                return temp.value;
            }
            temp = temp.next;
            counter++;
        }
        return null;
    }

    public int getSize() {
        Node<T> temp = head;
        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    @Override
    public String toString() {
        String result = "[";
        Node<T> temp = head;
        while (temp != null) {
            result += temp.value;
            // todo Fix extra comma space at the end
            result += ", ";
            temp = temp.next;
        }
        result += "]";
        return result;
    }
}
