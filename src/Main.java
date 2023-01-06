public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cDLL = new CircularDoublyLinkedList();
        cDLL.createCDLL(1);
        cDLL.insertNode(2, 1);

        System.out.println(cDLL.getHead().getNext().getValue());


    }
}
