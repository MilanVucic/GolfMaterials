package lesson_14;

public interface MyListInterface<T> {
    void add(T elemenet);
    int size();
    T get(int index);
}
