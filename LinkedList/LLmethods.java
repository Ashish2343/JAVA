package LinkedList;

public class LLmethods {
    public static class Node{
        int data;
        Node next;
        int size;

        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;
        void add(int val){
            Node temp = new Node(val);
            if(head == null || tail == null){
                head = tail = temp;
            }else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        void InsertAtStart(int val){
            Node temp = new Node(val);
            if(head == null || tail == null){
                head = temp;
            }
            temp.next = head;
            head = temp;
            size++;
        }

        void InsertA(int index, int val){
            if(index == size()){
                add(val);
                return;
            } else if (index ==0) {
                InsertAtStart(val);
                return;
            }
            Node temp = new Node(val);
            Node t = head;
            for (int i = 1; i <=index-1 ; i++) {
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
            size++;
        }
        int get(int index){
            Node t = head;
            for (int i = 1; i <=index ; i++) {
                t=t.next;
            }
            return t.data;
        }
        void deleteAt(int index){
            Node temp = head;
            if(index ==0){
                head = head.next;
                size--;

            }
            for (int i = 1; i <= index-1 ; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
    }

    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add(23);
        li.add(21);
        li.add(12);
        li.add(43);
        li.display();
        li.InsertA(3,44);
        li.display();
        System.out.println(li.get(2));
    }
}
