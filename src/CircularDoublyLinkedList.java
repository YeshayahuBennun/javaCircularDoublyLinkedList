public class CircularDoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;
    private int size;

    public CircularDoublyLinkedList() {
        //Empty
    }

    public DoublyNode getHead() {
        return head;
    }

    public void setHead(DoublyNode head) {
        this.head = head;
    }

    public DoublyNode getTail() {
        return tail;
    }

    public void setTail(DoublyNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //Create - Circular Doubly Linked List
    public DoublyNode createCDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode node = new DoublyNode();
        node.setValue(nodeValue);
        head = node;
        tail = node;
        node.setPrev(node);
        node.setNext(node);
        size = 1;

        return node;
    }

    //Insert - Circular Doubly Linked List
    public void insertNode(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.setValue(nodeValue);
        if (head == null) {
            createCDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.setPrev(tail);
            newNode.setNext(head);
            head.setPrev(newNode);
            tail.setNext(newNode);
            head = newNode;
        } else if (location >= size) {
            newNode.setNext(head);
            newNode.setPrev(tail);
            head.setPrev(newNode);
            tail.setNext(newNode);
            tail = newNode;
        } else {
            DoublyNode currentNode = head;
            int index = 0;
            while (index < location - 1) {
                currentNode = currentNode.getNext();
                index++;
            }
            newNode.setPrev(currentNode);
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
            newNode.getNext().setPrev(newNode);
        }
        size++;
    }

    //Traversal CDLL
    public void traversalCDLL(){

        if(head!=null){
            DoublyNode currentNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(currentNode.getValue());
                if(i!=size-1){
                    System.out.print(" -> ");
                }
                currentNode =currentNode.getNext();
            }
        }else {
            System.out.println("The CDLL does not exist.");
        }
    }
}




