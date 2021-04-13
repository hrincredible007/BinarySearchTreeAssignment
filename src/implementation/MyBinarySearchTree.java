package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    implementation.Node<E> root;


    @Override
    public void insert(E data) {
        implementation.Node<E> newNode = new implementation.Node<>(data);
        if(root == null){
            root = newNode;
        }
        else{
            implementation.Node<E> temp = root;
            implementation.Node<E> parent = null;
            while(temp!= null){
                parent = temp;
                if(data.compareTo(temp.getData()) <= 0){
                    temp = temp.getLeft();
                }
                else{
                    temp = temp.getRight();
                }
            }

            if(data.compareTo(parent.getData()) <= 0){
                parent.setLeft(newNode);
            }
            else{
                parent.setRight(newNode);
            }
        }
    }

    @Override
    public boolean search(E searchElement) {

        return false;
    }



    @Override
    public void inOrder(implementation.Node<E> node) {
        if(node!=null){

            inOrder(node.getLeft());
            System.out.println(node.getData());
            inOrder(node.getRight());
        }

    }

    @Override
    public void preOrder(implementation.Node<E> node) {


    }

    @Override
    public void postOrder(implementation.Node<E> node) {
        if(node!=null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getData());
        }

    }

    @Override
    public void reverseInOrder(Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
}
