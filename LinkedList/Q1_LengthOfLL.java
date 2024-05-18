package LinkedList;
// Here you have linked list but you don't know it's length you have to calculate lenght of list (iterative and recursively)
public class Q1_LengthOfLL {
    public static class LL {
        int data;
        LL next;

        LL(int data) {
            this.data = data;

        }
    }

    public static void main(String[] args) {
        LL a = new LL(5);  //Head
        // System.out.println(a.next);  Here b is not connected to a
        LL b = new LL(4);
        //   System.out.println(b);  Address of b
        LL c = new LL(3);
        LL d = new LL(2);
        LL e = new LL(1);

        a.next = b;   //5->4 3 2 1
        b.next = c;  // 5->4->3 2 1
        c.next = d; // 5->4->3->2 1
        d.next = e;// 5->4->3->2->1
        System.out.println();

    }

}