package LinkedList;

public class DoubleNode {
    DoubleNode prev, next;
    int value, key;

    DoubleNode(int key, int value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}
