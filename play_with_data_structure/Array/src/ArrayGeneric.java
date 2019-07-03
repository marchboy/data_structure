package play_with_data_structure.Array.src;

public class ArrayGeneric<E>{
    private E[] data;
    private int size;

    // -------------------------------------------------
    /*
    1、构造函数的命名必须和类名完全相同。
    2、Java中普通函数可以和构造函数同名，但是必须带有返回值。    
    3、构造函数的功能主要用于在类的对象创建时定义初始化的状态。它没有返回值，也不能用void来修饰。
    4、构造函数不能被直接调用，必须通过new运算符在创建对象时才会自动调用；而一般的方法是在程序执行到它的时候被调用的；
    */
    //--------------------------------------------------

    // 构造函数，传入数组的容量capacity构造Array;
    public ArrayGeneric(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    // 无参数的构造函数，默认数组容量capacity = 10;
    public ArrayGeneric() {
        this(10);
    }

    // -------------------------------------------------


    // 获取数组中元素个数;
    public int getSize(){
        return size;
    }
    
    // 获取数组的容量;
    public int getCapacity(){
        return data.length;
    }

    // 返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 向所有元素后添加一个新元素
    public void addLast(E e){
        add(size, e);
        // if (size == data.length){
        //     throw new IllegalAccessException("AddLast Failed. Array is full.");
        // }
        // // data[size++] = e;
        // data[size] = e;
        // size ++;
    }
    public void addFirst(E e){
        add(0, e);
    }

    // 在第index个位置插入一个新元素e
    public void add(int index, E e) {
            
        if (index < 0 || index > size){
            throw new IllegalArgumentException("AddLast Failed. Require index >=0 and index < size");
        }

        if (size == data.length){
            // throw new IllegalArgumentException("AddLast Failed. Array is full.");
            System.out.println("size before: " + size);
            resize(2 * data.length);
            System.out.println("size after: " + size);
        }

        for(int i = size - 1; i >= index; i --){
            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;

    }
    
    public void resize(int newCapacity){
        E[] newData = (E[]) new Object[newCapacity];
        for(int i = 0; i < size; i++)
            newData[i] = data[i];
        data = newData;
    } 



    // 获取index位置的元素
    public E get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get Failed. index is illegal.");
        return data[index];
    }

    // 修改index位置的元素e
    public void set(int index, E e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get Failed. index is illegal.");
        data[index] = e;
    }

    // 查找数组中是否存在元素e
    public boolean contains(E e){
        for(int i = 0 ; i < size; i++){
            // if(data[i] == e) 值比较&引用比较
            if (data[i].equals(e))
                return true;
        }
        return false;
    }

    // 查找数组中元素e所在的索引，如果元素不存在， 返回-1;
    public int find(E e){
        for(int i = 0; i < size; i++){
            // if(data[i] == e)
            if (data[i].equals(e))
                return i;
        }
        return -1;
    }

    public E remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get Failed. index is illegal.");
        E ret = data[index];
        for (int i = index + 1; i < size; i++)
            data[i-1] = data[i];
        size --;
        data[size] = null;

        if (size == data.length / 4 && data.length / 2 != 0){
            resize(data.length / 2);
        }

        return ret;
    }

    //删除数组中的第一个元素;
    public E removeFirst() {
        return remove(0);
    }

    //删除数组中的最后一个元素;
    public E  removeLast(){
        return remove(size-1);
    }
    
    //删除数组中的元素;
    public void removeElement(E e){
        int index = find(e);
        if(index != -1)
            remove(index);
    }


    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        res.append('[');
        for(int i = 0; i < size; i++){
            res.append(data[i]);
            if (i != size - 1){
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }

}

