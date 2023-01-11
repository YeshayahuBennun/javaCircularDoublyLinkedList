public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cDLL = new CircularDoublyLinkedList();
        cDLL.createCDLL(1);
        cDLL.insertNode(2, 0);
        cDLL.insertNode(3, 2);
        cDLL.insertNode(4, 5);
        cDLL.traversalCDLL();
        cDLL.deleteCDLL(2);
        cDLL.traversalCDLL();
    }
}
