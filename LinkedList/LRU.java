package LinkedList;

import java.util.HashMap;

public class LRU {
    int cap;
    Node head, tail;
    HashMap<Integer, Node> cash;

    LRU(int cap) {
        this.cap = cap;
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        this.head.next = this.tail;
        this.tail.pre = this.head;
    }

    int get(int key) {
        if (!cash.containsKey(key)) {
            return -1;
        }
        Node node = cash.get(key);
        remove(node);
        add(node);
        return node.value;

    }

    private void add(Node node) {
        Node nextNode = head.next;
        head.next = node;
        node.pre = head;
        node.next = nextNode;
        nextNode.pre = node;
    }

    private void remove(Node node) {
        Node prevNode = node.pre;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.pre = prevNode;
    }

    void put(int key, int value) {
        if (cash.containsKey(key)) {
            Node oldNode = cash.get(key);
            remove(oldNode);
        }
        Node node = new Node(key, value);
        cash.put(key, node);
        add(node);
        if (cash.size() > cap) {
            Node nodeToDelete = tail.pre;
            remove(nodeToDelete);
            cash.remove(nodeToDelete.key);
        }
    }

    public static void main(String[] args) {
        LRU cache = new LRU(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}

class Node {
    Node pre = null, next = null;
    int value, key;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.pre = null;
        this.next = null;
    }
}