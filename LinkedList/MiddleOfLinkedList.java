package LinkedList;

public class MiddleOfLinkedList {
    public static class Node {
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
        Node f = new Node(11);
        a.next = b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next =f;
        display(a);
        MiddleFromLeft(a);
        MiddleFromRight(a);
//        MiddleForOddList(a);
    }
    public static Node MiddleFromLeft(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
        return slow;
    }
    public static Node MiddleFromRight(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow =slow.next;
        System.out.println(slow.data);
        return slow;
    }
    public static Node MiddleForOddList(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
        return slow;
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
