package AlgoAndLeetCode;

public class LeetCode328 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(3);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(4);
//        Node g = new Node(7);
// 1,2,3,4,5,6,7,8
        a.next = b;
        b.next =c;
        c.next = d;
        d.next =e;
        e.next =f;
//        f.next =g;
        System.out.println(size(a));
        System.out.println(oddEvenList(a));
        display(a);
    }
    public static void display(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data+ " ");
        display(head.next);
    }

    public static Node oddEvenList(Node head) {
       Node slow = head;
       Node temp = head.next;
       Node fast = head.next;
       if(head == null||head.next == null){
           return head;
       }
       if(size(head)%2 != 0) {
           while (fast != null) {
               slow.next = fast.next;
               slow = slow.next;
               fast.next = slow.next;
               fast = fast.next;
           }
       }else{
           while (fast.next != null) {
               slow.next = fast.next;
               slow = slow.next;
               fast.next = slow.next;
               fast = fast.next;
           }
       }
       slow.next = temp;
       return head;
    }
    public static int size(Node head){
        Node temp =  head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}