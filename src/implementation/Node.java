package implementation;

public class Node<E extends Comparable<E>> implements myinterface.Node<E> {
    private E data;
    Node<E> left;
    Node<E> right;

    public Node(E data) {
        this.data = data;
        left = right  = null;

    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getLeft() {
        return left;
    }



    public Node<E> getRight() {
        return right;
    }

    @Override
    public void setLeft(myinterface.Node left) {
        this.left = (Node<E>) left;
    }

    @Override
    public void setRight(myinterface.Node right) {
        this.right = (Node<E>) right;

    }

}

