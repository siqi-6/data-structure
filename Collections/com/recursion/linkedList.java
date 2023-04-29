package com.recursion;

public class linkedList<E> {

    private Node dummyHead;
    private  int size ;

    public linkedList(){
        size = 0 ;
        dummyHead = new Node(null,null) ;
    }

    // 增加头
    public void addFirst(E value){
      add(0,value);
    }
    // 增加中间
    public void add(int index ,E value){
        Node pre = dummyHead;
        for (int i = 0; i < index; i++) {
            pre =pre.next;
        }
        pre.next =new Node(value,pre.next);
        size++;
    }
    // 增加尾部
    public void addLast(E value){
        add(size,value);
    }
    //查看
    public E get(int index){
        if(index<0||index>=size){
            throw new RuntimeException("索引越界");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur =cur.next;
        }
        return cur.val;
    }

    //更改
    public void set(int index, E value ){
        if(index<0||index>size){
            throw new RuntimeException("索引越界");
        }
        Node head = dummyHead.next;
        for (int i = 0; i < index-1; i++) {
            head =head.next;
        }

       head.next = new Node(value,head.next.next);
    }

    //获取头
    public E getFirst(){
       return get(0);
    }
    // 获取尾
    public E getLast(){
        return get(size-1);
    }
    // 根据值移除
    public void deleteByValue(E value) {
        Node pre = dummyHead;
        while (pre.next != null) {
            if (pre.next.val.equals(value)) {
              break;
            }
            pre = pre.next;
        }
        if(pre.next!=null){
            Node cur = pre.next;
            pre.next = cur.next;
            cur =null;
            size--;
        }

    }

    //删除头
    public void deleteFirst(){
        delete(0);
    }

    // 删除中间
    public E delete(int index){
        if(index <0 || index>=size){
            throw new RuntimeException("索引异常");
        }
        Node pre = dummyHead ;
        for (int i = 0; i < index; i++) {
            pre = pre.next ;
        }
        Node ret = pre.next ;
        pre.next = ret.next;
        ret.next = null ;
        size--;
        return ret.val;
    }

    // 删除尾部
    public  void deleteLast(){
     delete(size-1);
    }

    // 是否包含
    public boolean contains(E value){
        Node cur = dummyHead;
        while(cur!=null){
            cur= cur.next ;
            if(cur.val.equals(value)){
                return true ;
            }
        }
        return false ;
    }

    // 是否空
    public boolean isEmpty(){
        return size==0;
    }

    // 大小
    public int  getSize(){
        return size;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("size: %d \t",size));
        sb.append("Linkedlist:head [");
        Node cur = dummyHead.next;
        while(cur!=null){
            sb.append(cur.val+" ->");
            cur=cur.next;
        }
        sb.append("NULL");
        sb.append("] tail");
        return sb.toString();
    }

    private class Node{
        public E val ;
        public Node next ;
        public Node(E val,Node next){
            this.val = val;
            this.next = next;
        }
    }
}
