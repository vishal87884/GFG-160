package LinkedList;

public class ReverseLinkedList {
   static Node head;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(0);
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);
        head = linkedList.getHead();
        reverse();
        println(head);
        System.out.println(linkedList.head);
    }

    public static void reverse() {
        Node curr = head;
        Node pre = null, next;
        while (curr.next != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;
    }

    public static void println(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
