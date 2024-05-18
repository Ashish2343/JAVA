package AlgoAndLeetCode;

public class LeetCode2130 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(3);
        a.next = b;
        b.next =c;
        c.next = d;
        System.out.println(pairSum(a));
    }
    public static int pairSum(Node head) {
            Node temp = head;
            int[] arr = new int[size(head)];
            int i = 0;
            while(temp != null){
                arr[i] = temp.data;
                temp = temp.next;
                i++;
            }
            int l =0;
            int r = arr.length-1;
            int max = 0;
            while(l<r){
                int sum = arr[l] + arr[r];
                max = Math.max(max,sum);
                l++;
                r--;
            }
            return max;
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
