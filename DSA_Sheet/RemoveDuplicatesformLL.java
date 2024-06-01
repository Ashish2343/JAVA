package DSA_Sheet;

import java.util.ArrayList;
import java.util.HashMap;

 class RemoveDuplicatesformLL {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d =  new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;

        removeDuplicates(a);
        print(a);

    }
    public static Node removeDuplicates(Node head)
    {

        Node temp = head;
        Node curr = null;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(temp != null){
            if(map.containsKey(temp.data)){
                curr.next = temp.next;
                temp = temp.next;
            }else{
                map.put(temp.data,count++);
                curr = temp;
                temp = temp.next;
            }
        }
        return head;
    }
    static void print(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
