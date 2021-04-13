package myinterface;

public interface Node<E extends Comparable<E>> {
    public E getData();
    public void setData(E data);
    public Node getLeft();
    public Node getRight();
    public void setLeft(Node left);
    public void setRight(Node right);

}
