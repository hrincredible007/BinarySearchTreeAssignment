package main;

import implementation.MyBinarySearchTree;
import myinterface.BinarySearchTreeADT;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(66);
        tree.insert(45);
        tree.insert(50);
        tree.insert(12);
        tree.insert(70);
        tree.insert(25);
        tree.insert(45);
        tree.inOrder(tree.getRoot());
        tree.postOrder(tree.getRoot());
        tree.preOrder(tree.getRoot());
        tree.search(25);




    }
}
