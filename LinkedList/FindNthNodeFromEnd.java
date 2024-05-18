package LinkedList;

public class FindNthNodeFromEnd {
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
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node q =NthNodeM1(a,1);
        System.out.println(q.data);
        Node r = NthNodeM2(a,1);
        System.out.println(r.data);
    }
    public static Node NthNodeM1(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
           size++;
           temp = temp.next;
        }
       int m =size-n+1;
        // mth node  from start
        temp = head;
        for (int i = 1; i <=m-1 ; i++) {
            temp =temp.next;
        }
        return temp;
        }
        public static Node NthNodeM2(Node head, int n){
        Node slow  = head;
        Node fast = head;
            for (int i = 1; i <=n; i++) {
                fast = fast.next;
            }
            while(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
