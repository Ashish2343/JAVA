package LinkedList;

public class ImplementationOfDoubLeLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }
        public static class DoubleLL{
            Node head = null;
            Node tail =null;
            void add(int data){
                Node temp = new Node(data);
                if(head == null || tail == null){
                    head = temp;
                } else{
                    tail.next = temp;
                    temp.prev =tail;
                }
                tail = temp;
            }
            Node InsertAtHead( int val){
                Node t = head;
                Node temp = new Node(val);
                temp.next = t;
                t.prev = temp;
                head =temp;
                return head;
            }
            Node InsertAttail(int val){
                Node t = tail;
                Node temp =new Node(val);
                t.next =temp;
                temp.prev =t;
                tail =temp;
                return tail;
            }
            void display(){
                Node temp = head;
                while(temp != null){
                    System.out.print(temp.data + " ");
                    temp =temp.next;
                }
                System.out.println();
            }
            void DisplayRev(){
                Node temp = tail;
                while(temp != null){
                    System.out.print(temp.data + " ");
                    temp =temp.prev;
                }
                System.out.println();
            }
            void InsertAt(int Index , int val){
                Node temp = new Node(val);
                Node t =head;
                for (int i = 1; i <=Index-1 ; i++) {
                    t= t.next;
                }
                temp.next = t.next;
                t.next.prev = temp;
                t.next = temp;
                temp.prev = t;
            }

        }

    public static void main(String[] args) {
        DoubleLL li = new DoubleLL();
        li.add(2);
        li.add(1);
        li.add(3);
        li.add(5);
        li.add(7);
        li.InsertAtHead(6);
        li.InsertAttail(9);
        li.InsertAt(2,8);
        li.display();
        li.DisplayRev();
    }
}
