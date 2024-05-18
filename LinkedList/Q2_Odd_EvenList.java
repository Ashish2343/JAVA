package LinkedList;

public class Q2_Odd_EvenList {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(8);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(9);
        ListNode g = new ListNode(2);
        ListNode h = new ListNode(4);

        a.next =b;
        b.next =c;
        c.next =d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        display(a);
        ListNode result = OddEven(a);
        display(result);
    }
    public static void display(ListNode head){
        ListNode temp =head;
        while(temp != null){
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static ListNode OddEven(ListNode head){
        ListNode odd = new ListNode(-1);
        ListNode O = odd;
        ListNode even = new ListNode (0);
        ListNode E = even;
        ListNode temp =head;
        while(temp != null){
            if(temp.val%2 == 0){
                ListNode a = new ListNode(temp.val);
                E.next = a;
                temp = temp.next;
                E = E.next;
            } else{
                ListNode a = new ListNode(temp.val);
                O.next = a;
                temp = temp.next;
                O = O.next;
            }
        }
       O.next = even.next;
        return odd.next;

    }
}
