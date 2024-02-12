package lesson_14;

public class MyArray<T> {
    private T[] array; // start array of length 5
    private int size;

    // array: "Milan", "Luca", "Max", "Marco", "Nicola"
    public MyArray() {
        array = (T[]) new Object[5];
    }

    public void add(T element) {
        if (size == array.length) {
            // temp: null null null null null null null null null null null null
            T[] temp = (T[]) new Object[array.length + 5];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            // temp: "Milan", "Luca", "Max", "Marco", "Nicola" null null null null null null null
            array = temp;
            // array: "Milan", "Luca", "Max", "Marco", "Nicola" null null null null null null null
        }
        array[size] = element;
        size++;
    }

    public T get(int index) {
        return array[index];
    }

    public int getSize() {
        return size;
    }

    public void set(T element, int index) {
        array[index] = element;
    }

    // todo Implement inserting an element at position
    // Example  1 2 3 4 5, insert 10 at 3
    // End result: 1 2 3 10 4 5
    // Insert 5 at index 0
    // End result 5 1 2 3 10 4 5
    public void insert(T element, int index) {

    }

    public boolean contains(T value) {
        return false; // todo implement me
    }

    public int indexOf(T value) {
        return -1; // todo implement me
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += array[i];
            if (i != size - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}