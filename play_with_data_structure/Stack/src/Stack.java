package play_with_data_structure.Stack.src;

public interface Stack<E>{

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();

}