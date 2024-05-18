package LinkedList;

public class RemoveNthNodeFromEnd {
    public static class Node {
        int data;  // Value
        Node next;  // Next Node address

        Node(int data){
            this.data = data;
        }

    }

    public static void main(String[] args) {
        Node a = new Node(5);  //Head
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new  Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
       a= delFromEnd(a,5);
        display(a);
    }
    public static Node delFromEnd(Node head, int indexFromStart){
        Node slow  = head;
        Node fast = head;
        for (int i = 1; i <=indexFromStart; i++) {
            fast = fast.next;
        } if(fast == null){
            head=head.next;
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
