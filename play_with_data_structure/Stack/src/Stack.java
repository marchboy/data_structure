package play_with_data_structure.Stack.src;

public interface Stack<E>{
    /**
     * 
     * C++友元函数：可以直接访问类的私有成员的非成员函数，是定义在类之外的普通函数，它不属于任何类，
     * 但需要在类的定义中加以声明，声明时只需在友元的名称前加上关键字friend。
     * 
     * 
     * 
     * 
     * 接口是Java语言的一个抽象类类型，是抽象方法的集合，以interface来声明。
     * 一个类通过继承接口的方式，从而来继承接口的抽象方法。
     * 类描述对象的属性和方法。接口则包含类要实现的方法。
     * 接口不能用于实例化对象。
     * 接口没有构造方法。
     * 接口中所有的方法必须是抽象方法。
     * 接口不能包含成员变量，除了 static 和 final 变量。
     * 接口不是被类继承了，而是要被类实现。接口支持多继承。
    * @param <E>
    */

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();

}