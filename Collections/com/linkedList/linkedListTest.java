package com.linkedList;

public class linkedListTest {
    public static void main(String[] args) {
        linkedList<Integer> list = new linkedList<Integer>();
        for (int i = 0; i < 4; i++) {
            list.addLast(i);
        }
        System.out.println(list);
        System.out.println(list.getLast());
        list.addFirst(8);
        System.out.println(list);
        list.add(2,9);
        System.out.println(list);
        // 查看
        System.out.println(list.get(1));
        list.set(1,10);
        System.out.println(list);
        list.deleteFirst();
        System.out.println(list);
        list.deleteLast();
        System.out.println(list);
        list.delete(1);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.contains(10));
        list.deleteByValue(10);
        System.out.println(list);
    }

}
