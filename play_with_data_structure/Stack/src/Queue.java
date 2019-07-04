package play_with_data_structure.Stack.src;

public interface Queue<E>{
    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}