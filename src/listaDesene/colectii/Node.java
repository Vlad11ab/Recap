package listaDesene.colectii;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    private T data;
    private Node<T> next;


    public void setData(T data) {
        this.data = data;
    }
    public void setNext(Node<T> node){
        this.next = node;
    }


    public T getData() {
        return data;
    }
    public Node<T> getNext(){
        return next;
    }

    @Override
    public int compareTo(Node<T> object) {
        return this.data.compareTo(object.data);
    }

    @Override
    public String toString(){
        return data.toString();
    }
}
