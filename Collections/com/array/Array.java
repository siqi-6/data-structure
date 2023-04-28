package com.array;

public class Array<E> {

    private E[] arr;
    private  int size ;

    public Array(int capacity){
        arr  =  (E[]) new Object[capacity];
        size = 0 ;
    }

    public  Array(){
        this(10);
    }

    // 判断是否为空
    public  boolean isEmpty(){
        return size==0;
    }

    // 获取容量
    public  int getSize(){
        return size;
    }

    // 添加末尾元素
    public  void addLast(E value){
       addValue(size,value);
    }

    // 添加指定位置
    public void addValue(int index, E value){
        if(index<0||index>size){
            throw new ArrayIndexOutOfBoundsException("索引越界");
        }
        if(size==arr.length){
            resize(arr.length*2);
        }
        size++;
        for (int i = arr.length-1; i >index; i--) {
            arr[i] = arr[i-1] ;
        }
        arr[index]=value;

    }
    // 扩容
    public void resize(int capacity){
            E[] es =  (E[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                 es[i] = arr[i];
            }
            arr = es ;
    }
    // 添加首元素
    public  void addFirst(E value){
        addValue(0,value);
    }

    // 删除指定元素
    public void deleteValue(int index){
        if(index<0||index>size){
            throw new ArrayIndexOutOfBoundsException("索引越界");
        }
        if(size==0){
            throw new ArrayIndexOutOfBoundsException("数组为空，不能删除");
        }
        for (int i = index; i < arr.length-1; i++) {
            arr[i] =arr[i+1];
        }
        size--;
        if(size==arr.length/2){
            resize(arr.length/2);
        }
    }
    // 删除首元素
    public void deleteFirst(){
       deleteValue(0);
    }
    // 删除末尾元素
    public  void deleteLast(){
        deleteValue(size);
    }
    // 删除指定值
    public boolean deleteSpecial(E value){
        if(size==0){
            throw new ArrayIndexOutOfBoundsException("数组为空，不能删除");
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(value)){
                deleteValue(i);
                return true;
            }
        }
        return false;
    }
    // 是否包含
    public boolean contains(E value){
        for (E i : arr) {
            if(value.equals(i)){
                return true;
            }
        }
        return false;
    }
    // 设置值
    public void update(int index, E value){
        if(index<0||index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("索引越界");
        }
         arr[index] =value;
    }
    // 根据索引查值
    public E get(int index){
        if(index<0||index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("索引越界");
        }
       return arr[index] ;
    }
    // 根据值返回索引
    public int returnIndex(E value){
        for (int i = 0; i < arr.length; i++) {
           if(arr[i].equals(value)){
               return i;
           }
        }
        return -1;
    }
    // 打印
    public String toString(){
        StringBuilder sb = new StringBuilder();
       sb.append(String.format("Array: size =%d, capacity = %d\n",size,arr.length))
                .append("[");
        for (int i = 0; i < size; i++) {
            if(i==size-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
