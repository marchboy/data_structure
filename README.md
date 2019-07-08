# data_structure

# 一、数组

## 1、基本数组

向数组中（任意位置）添加元素，查询元素，删除元素，修改元素;
包含，搜索，删除元素

## 2、泛型
Array[boolean, byte, int, short, long, char, float, double]

泛型不可以放置基本数据类型，只能是类对象

每个基本数据类型都有对应的包装类
Boolean, Byte, Int, Short, Long, Char, Float, Double

## 3、动态数组
容量自动扩充或者缩减

## 4、时间复杂度分析
大O描述的是算法运行时间和输入数据之间的关系
O(1) O(n) O(log n) O(n^2)
大O 表示渐进时间复杂度（描述n趋于无穷的情况）

#### 复杂度震荡
数组容量减少时，不着急去缩小数组的capacity;
等到为容量的1/4的时，再去缩小capacity。



# 二、栈和队列

## 1、栈（牛奶杯）
本身也好似一种数据结构

相比数组，栈对应的操作是“数组的子集”

只能从一端添加元素，也只能从同一端取出元素（先进后出， Last In First Out，LIFO ）

这一端称之为栈顶

## 2、栈的应用
常见的Undo操作，撤销原理：靠栈的原理实现 

程序调用的系统栈：A()--B()--C()

Interface Stack<E> ------ArrayStack<E>

void push(E) ：入栈

E pop() ：出栈,拿出栈顶的元素

E peek() ：查看栈顶的元素是什么

int getSize（） ：获取栈中元素的数量

boolean isEmpty() ：栈是否为空

递归的应用

## 3、队列
先进先出的队列：Fisrt in Fist Out（FIFO）

interface Queue<E> 

void enqueue(E)  

E dequede()

E getFront()

int getSize()

boolean isEmpty

## 4、循环队列

front == tail 队列为空

（tail + 1）% c == front 队列满，capacity浪费一个空间

广度优先遍历


# 三、链表