package play_with_data_structure.Array.src;

public class Array{
    private int[] data;
    private int size;

    // 构造函数，传入数组的容量capacity构造Array;
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    // 无参数的构造函数，默认数组容量capacity = 10;
    public Array(){
        this(10);
    }

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
    public void addLast(int e){
        add(size, e);
        // if (size == data.length){
        //     throw new IllegalAccessException("AddLast Failed. Array is full.");
        // }
        // // data[size++] = e;
        // data[size] = e;
        // size ++;
    }
    public void addFirst(int e){
        add(0, e);
    }

    // 在第index个位置插入一个新元素e
    public void add(int index, int e) {
        if (size == data.length){
            throw new IllegalArgumentException("AddLast Failed. Array is full.");
        }
            
        if (index < 0 || index > size){
            throw new IllegalArgumentException("AddLast Failed. Require index >=0 and index < size");
        }
        for(int i = size - 1; i >= index; i --){

            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;

    }

    // 获取index位置的元素
    public int get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get Failed. index is illegal.");
        return data[index];
    }

    // 修改index位置的元素e
    public void set(int index, int e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get Failed. index is illegal.");
        data[index] = e;
    }

    // 查找数组中是否存在元素e
    public boolean contains(int e){
        for(int i = 0 ; i < size; i++){
            if(data[i] == e)
                return true;
        }
        return false;
    }

    // 查找数组中元素e所在的索引，如果元素不存在， 返回-1;
    public int find(int e){
        for(int i = 0; i < size; i++){
            if(data[i] == e)
                return i;
        }
        return -1;
    }

    public int remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get Failed. index is illegal.");
        int ret = data[index];
        for (int i = index + 1; i < size; i++)
            data[i-1] = data[i];
        size --;
        return ret;
    }

    public int removeFirst() {
        return remove(0);
    }

    public int removeLast(){
        return remove(size-1);
    }

    public void removeElement(int e){
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

