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
}
