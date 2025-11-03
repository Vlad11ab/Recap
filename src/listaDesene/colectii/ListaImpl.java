package listaDesene.colectii;

public class ListaImpl<T extends Comparable<T>> implements Lista<T> {
    private Node<T> head;
    private int size;



    @Override
    public Node<T> getHead() {
        if (head == null) {
//            System.out.println("Error. Empty list.");
            return null;
        }
            return head;
    }

    @Override
    public void addStart(T data) {
        Node<T> node = new Node();
        node.setData(data);

        if (head == null) {
            head = node;
        } else {

            node.setNext(head);
            head = node;
        }

        size++;
    }

    @Override
    public void addLast(T data) {
        Node<T> node = new Node<T>();
        node.setData(data);
        node.setNext(null);

        if (head == null) {
            head = node;
        } else {
            Node<T> aux = head;

            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(node);
        }

        size++;
    }

    @Override
    public void addPosition(T data, int pos) {
        if(pos <= 0) {
            addStart(data);
        } else if(pos >= size){
            addLast(data);
        } else {
            Node<T> node = new Node<T>();
            node.setData(data);

            Node<T> aux = head;

            for(int i=0; i < pos - 1; i++){
                aux = aux.getNext();
            }

            aux.setNext(node);
            node.setNext(aux.getNext());


            size++;
        }


    }

    @Override
    public void remove(T data) {
        if(head == null) {
            System.out.println("Error. Empty list");
        }else if(head.getData().equals(data)){
            head = head.getNext();
            size--;
        }

        Node<T> current = head;
        Node<T> prev = null;

        while(current != null && !current.getData().equals(data)){
            prev = current;
            current = current.getNext();
        }

        if(current == null) {
            System.out.println("Elementul " + data + " nu a fost gasit");
        }
            else{
                prev.setNext(current.getNext());
                size--;

        }


    }

   @Override
   public void removeStart(){

        if (head == null) {
            System.out.println("Error. Empty list");
        } else {
            head = head.getNext();
            size--;

        }


   }

    @Override
    public void removePosition(int pos) {
        if (pos < 0) {
            System.out.println("Error: " + pos + " <= 1 <= " + size);
        } else if (pos > size) {
            System.out.println("Error: " + pos + " > " + size);
        } else if (pos == 0) {
            removeStart();
        } else {
            Node<T> current = head;
            Node<T> prev = current;

            for (int i = 0; i < pos - 1; i++) {
                prev = current;
                current = current.getNext();
            }

            prev.setNext(current.getNext());
            size --;
        }


    }

        @Override
        public void showList() {
            if (head == null) {
                System.out.println("Lista este goala");
            } else {
                Node<T> aux;
                aux = head;

                while (aux != null) {
                    System.out.println(aux.getData());
                    aux = aux.getNext();
                }
            }
        }

    @Override
    public int getSize() {
//        System.out.println(size);
        return size;
    }


}
