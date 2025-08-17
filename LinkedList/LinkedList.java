package LinkedList;

public class LinkedList {
    Node head;

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node tempHead = head;
            while (tempHead.next != null) {
                tempHead = tempHead.next;
            }
            tempHead.next = node;
        }
    }

    public void println() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public Node getHead() {
        return head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(21);
        list.add(122);
        list.add(1223);
        list.add(1234);
        list.println();
    }
}
