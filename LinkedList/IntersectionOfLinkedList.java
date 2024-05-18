package LinkedList;

public class IntersectionOfLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        Node g = new Node(90);
        Node h = new Node(9);
        Node k = new  Node(11);
        Node l = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;              // a -> b -> c -> d -> e -> f -> g
        d.next = e;                   // h -> k -> l ->f
        e.next = f;
        f.next = g;
        h.next = k;
        k.next =l;
        l.next = f;
      //  k.next = d;
        diaplay(a);
        diaplay(h);
        intersection(a,h);

    }

    public static void diaplay(Node head){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node intersection(Node headA, Node headB){
        Node temp1 = headA;
        Node temp2 = headB;
        int m = size(headA);
        int n = size(headB);

        for (int i = 1; i <= m-n; i++) {
            temp1 = temp1.next;
        }
        if(temp1.data == temp2.data){
            return temp1;
        }
        else {
            while (temp2.data != temp1.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        System.out.println(temp1.data);
        return temp1;
    }
        public static int size(Node head){
        Node temp = head;
        int i = 0;
        while (temp != null){
            i++;
            temp = temp.next;
          }
        return i;
        }

}
