package DSA_Sheet;

public class Deletion_in_circularLL {
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    private static Node remove(Node head, int data){
        Node start = head;
        while(start.next.data != data){
            start = start.next;
        }
        start.next = start.next.next;
        return head;
    }

    private static void print(Node head){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while(temp != head);
        }
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(10);

        a.next = b;
        b.next =c;
        c.next = d;
        d.next = e;
        e.next = a;

        print(a);
        remove(a,7);
        System.out.println();
        print(a);
    }
}
