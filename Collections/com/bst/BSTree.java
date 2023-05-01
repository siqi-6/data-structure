package com.bst;

import com.linkedList.LinkedlistQueue;

import java.util.LinkedList;

public class BSTree<E extends Comparable<E>> {
    private class Node {
        private E val;
        private Node left, right;

        public Node(E val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    private int size;
    private Node root;

    public BSTree() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //添加
    public Node add(Node node, E value) {
        if (node == null) {
            size++;
            return new Node(value);
        }
        if (node.val.compareTo(value) > 0) {
            node.left = add(node.left, value);
        }
        if (node.val.compareTo(value) < 0) {
            node.right = add(node.right, value);
        }
        return node;
    }

    public void add(E value) {
        root = add(root, value);
    }

    // 查找
    public boolean contains(Node node, E value) {
        while (node != null) {
            if (node.val.compareTo(value) == 0) {
                return true;
            }
            if (node.val.compareTo(value) > 0) {
                return contains(node.left, value);
            }
            if (node.val.compareTo(value) < 0) {
                return contains(node.right, value);
            }
        }
        return false;
    }

    public boolean contains(E value) {
        return contains(root, value);
    }

    // 前序遍历
    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void preOrder() {
        preOrder(root);
    }

    ;

    // 中序遍历
    public void midOrder(Node node) {
        if (node == null) {
            return;
        }
        midOrder(node.left);
        System.out.print(node.val +" ");
        midOrder(node.right);
    }

    public void midOrder() {
        midOrder(root);
    }

    // 后序遍历
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+ " ");
    }

    public void postOrder() {
        postOrder(root);
    }

    // 找到最小值
    public Node minNum(Node node) {
        if (node == null) {
            return null;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public E minNum() {
        return minNum(root).val;
    }

    // 找到最大值
    public Node maxNum(Node node) {
        if (node == null) {
            return null;
        }
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    public E maxNum() {
        return maxNum(root).val;
    }

    // 层序遍历
    public void levelOrder() {
        LinkedList<Node> list = new LinkedList<>();
        list.addLast(root);
        while (!list.isEmpty()) {
            Node cur = list.remove();
            System.out.println(cur.val);
            if(cur.left!=null) {
                list.addLast(cur.left);
            }
            if(cur.right!=null) {
                list.addLast(cur.right);
            }
        }
    }

    // 前序遍历非递归实现

    // 删除最小值
    public E removeMin() {
        E ret = minNum();
        removeMin(root);
        return ret;
    }

    public Node removeMin(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

    public E removeMax() {
        E ret = maxNum();
        removeMax(root);
        return ret;
    }

    // 删除最大值
    public Node removeMax(Node node) {
        if (node.right == null) {
            Node leftNode = node.left;
            node.left = null;
            size--;
            return leftNode;
        }
        node.right = removeMax(node.right);
        return node;
    }
    public void remove(E value){
        remove(root,value);
    }

    // 删除任意值
    public Node remove(Node node, E value) {
        if (node == null) {
            return null;
        }
        if (node.val.compareTo(value) > 0) {
            node.left = remove(node.left, value);
            return node;
        }
        else if (node.val.compareTo(value) < 0) {
            node.right = remove(node.right, value);
            return node;
        }else {
            if (node.left == null) {
                Node rightNode = node.right;
                node.right = null;
                size--;
                return rightNode;
            }
            if (node.right == null) {
                Node leftNode = node.left;
                node.left = null;
                size--;
                return leftNode;
            }
            Node rightMin = minNum(node.right);
            rightMin.left = node.left;
            rightMin.right = removeMin(node.right);
            node.left = node.right = null;
            size--;
            return rightMin;
        }
    }

    // 更新某个点的值
    public  void update(){

    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        getBST(root, 0, res);
        return res.toString();
    }

    public void getBST(Node node, int depth, StringBuilder res) {
        if (node == null) {
            res.append(getDepth(depth) + "null" + "\n");
            return;
        }
        res.append(getDepth(depth) + node.val + "\n");
        getBST(node.left, depth + 1, res);
        getBST(node.right, depth + 1, res);

    }

    public String getDepth(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("--");
        }
        return sb.toString();
    }
}

