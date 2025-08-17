package LinkedList;

public class Rotated {
    public Node rotate(Node head, int k) {
        Node curr=head;
        int len=1;
        while(curr.next!=null){
            curr=curr.next;
            len++;
        }
        k%=len;
        curr.next=head;
        curr=head;
        for(int i=1;i<k;i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        return head;
    }
}
