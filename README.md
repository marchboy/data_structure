# data_structure

### 基本数组

向数组中（任意位置）添加元素，查询元素，删除元素，修改元素;
包含，搜索，删除元素

### 泛型
Array[boolean, byte, int, short, long, char, float, double]

泛型不可以放置基本数据类型，只能是类对象

每个基本数据类型都有对应的包装类
Boolean, Byte, Int, Short, Long, Char, Float, Double

### 动态数组
容量自动扩充或者缩减

### 时间复杂度分析
大O描述的是算法运行时间和输入数据之间的关系
O(1) O(n) O(log n) O(n^2)
大O 表示渐进时间复杂度（描述n趋于无穷的情况）

#### 复杂度震荡
数组容量减少时，不着急去缩小数组的capacity;
等到为容量的1/4的时，再去缩小capacity。

