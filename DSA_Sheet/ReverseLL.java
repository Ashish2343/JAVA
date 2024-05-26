package DSA_Sheet;

public class ReverseLL {
    static class Node{
        int val;
        Node next;

        Node(int val){ this.val =val ;}
    }
    static void display(Node head){
        Node temp = head;
        while(temp!= null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node ITRreverse(Node head){
        Node current = head;
        Node next = null;
        Node prev = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    static Node RecursicveReverse(Node head){
        if(head== null || head.next==null) return head;

        Node rest = RecursicveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return rest;

    }
    public static void main(String[] args) {
        Node a  = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
      // a =  ITRreverse(a);
        a = RecursicveReverse(a);

        display(a);
    }
}
