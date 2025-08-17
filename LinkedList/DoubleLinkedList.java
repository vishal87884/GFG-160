package LinkedList;

public class DoubleLinkedList {
    DoubleNode head, tail;

    public void add(int key, int value) {
        DoubleNode node = new DoubleNode(key, value);
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void printForword() {
        DoubleNode node = head;
        System.out.println();
        while (node != null) {
            System.out.print(node.key + " " + node.value + " -> ");
            node = node.next;
        }
    }

    public void printBackword() {
        DoubleNode node = tail;
        System.out.println();
        while (node != null) {
            System.out.print(node.key + " " + node.value + " -> ");
            node = node.prev;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1, 10);
        list.add(2, 20);
        list.add(3, 30);
        list.add(4, 40);
        list.add(5, 50);
        list.add(6, 60);
        list.printForword();
        list.printBackword();
    }
}
