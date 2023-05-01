package com.bst;

import org.w3c.dom.Node;

import java.nio.file.NotDirectoryException;

public class BSTTest {
    public static void main(String[] args) {
        BSTree<Integer> tree = new BSTree<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int i : nums) {
            tree.add(i);
        }
        tree.levelOrder();
        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.midOrder();
        System.out.println();
        tree.postOrder();
        System.out.println();
        System.out.println(tree.contains(5));
        System.out.println(tree.getSize());
        System.out.println(tree.minNum());
        System.out.println(tree.maxNum());
        System.out.println(tree.isEmpty());
        System.out.println(tree.removeMin());
        System.out.println(tree.removeMax());
        tree.remove(3);
        System.out.println(tree);
    }
}
