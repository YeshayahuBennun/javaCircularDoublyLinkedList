public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cDLL = new CircularDoublyLinkedList();
        cDLL.createCDLL(5);
        System.out.println(cDLL.getHead().getValue());
        System.out.println(cDLL.getTail().getValue());
        System.out.println(cDLL.getSize());
    }
}
