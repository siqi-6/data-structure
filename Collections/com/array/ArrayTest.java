package com.array;

public class ArrayTest {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();

        // 添加最后一个元素
        for (int i = 0; i <10 ; i++) {
          arr.addLast(i);
        }
        System.out.println(arr);
        // 扩容
        arr.addLast( 11);
        System.out.println(arr);
        arr.deleteLast();
        System.out.println(arr);

        // 删除首元素
        arr.deleteFirst();
        System.out.println(arr);
        // 删除最后一个元素
        arr.deleteLast();
        System.out.println(arr);
        // 删除指定索引
        arr.deleteValue(3);
        System.out.println(arr);
        // 删除指定值
        arr.deleteSpecial(8);
        System.out.println(arr);
        //增加首元素no6
        arr.addFirst(10);
        System.out.println(arr);
        // 添加指定位置元素
        arr.addValue(1,9);
        System.out.println(arr);
        // 更新值
        arr.update(1,8);
        System.out.println(arr);
        // 根据值查索引
        System.out.println(arr.get(0));
        // 根据索引查值
        System.out.println(arr.returnIndex(10));
        // 是否为空
        System.out.println(arr.isEmpty());
        // 是否包含某元素 no11
        System.out.println(arr.contains(10));
    }
}
