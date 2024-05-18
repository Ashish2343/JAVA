package LinkedList;

public class LL {
    public static class Node{
        int data;  // Value
        Node next;  // Next Node address

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);  //Head
       // System.out.println(a.next);  Here b is not connected to a
        Node b = new Node(4);
      //   System.out.println(b);  Address of b
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);

        // 5->4->3->2->1
        a.next = b;   //5->4 3 2 1
        b.next = c;  // 5->4->3 2 1
        c.next = d; // 5->4->3->2 1
        d.next = e;// 5->4->3->2->1
      //  System.out.println(a.next);   // Now b is connected to "a" so "a" has address of b
      //  System.out.println(a.next.data);  // Now "a" also have data of "b"

        // Printing all data using for loop

       // Node temp = a; // Making a temp Node which is pointing towards a   temp -> a

//        for (int i = 1; i <=5 ; i++) {
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }


//        while(temp != null){  // code for printing list
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
       display(a);

    }

    // Using Recursion
    public static void display(Node head){
        if(head == null){
            return ;
        }
        System.out.println(head.data +" ");
        display(head.next);

    }
}
