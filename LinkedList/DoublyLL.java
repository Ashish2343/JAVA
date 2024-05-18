package LinkedList;

public class DoublyLL {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }
        public static void Display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp =temp.next;
            }
            System.out.println();
        }
        public static void Display2(Node tail){
            Node temp = tail;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp =temp.prev;
            }
            System.out.println();
        }


    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(1);
        Node c = new Node(32);
        Node d = new Node(2);
        Node e = new Node(5);
        Node f = new Node(3);

        a.prev =null;
        a.next = b;
        b.prev =a;
        b.next =c;
        c.prev =b;
        c.next =d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next =f;
        f.prev =e;
        f.next =null;
        Display(a);
        Display2(f);

    }
}
