package LinkedList;

// Here we have to create linkedlist methods which add numbers in linkedlist by a call and also find size of linked list like in ArrayList
// ex-   list.add(4)  will add 4 in linkedlist and make it head
public class ImplementaionOfLL {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val) {
            Node temp = new Node(val);
            if (head == null || tail == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
         void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
             System.out.println();
        }
         int size(){
//            Node temp = head;
//            int i =0;
//            while(temp != null) {
//                temp = temp.next;
//                i++;
//                 }
//            return i;
             return size;
            }
            void InsertAtStart(int val){
                Node temp = new Node(val);
                if(head == null || tail == null){
                    head = temp;
                } else{
                    temp.next = head;
                    head = temp;
                }
                size++;
            }
            void InsertAt(int index, int val){
                Node t = new Node(val);
                Node temp = head;
                if(index == size()){
                    add(val);
                    return;
                    } else if (index ==0) {
                    InsertAtStart(val);
                    return;
                }
                for (int i = 1; i <=index-1 ; i++) {
                    temp = temp.next;
                }
                t.next=temp.next;
                temp.next=t;
                size++;
            }
            int get(int index){
                Node temp = head;
                for (int i = 1; i <=index ; i++) {
                    temp = temp.next;
                }
                return temp.data;
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
            Linkedlist li = new Linkedlist();
//            li.InsertAtStart(10);
//            li.display();
             li.add(5);
             li.add(4);
             li.add(3);
             li.add(2);
            li.display();
            li.InsertAt(2,10);
            li.InsertAt(5,11);
            li.display();
           // System.out.println(li.tail.data);
          //  System.out.println(li.get(2));
         //   System.out.println(li.size);
            li.deleteAt(2);
            li.display();
//            System.out.print(li.size());


        }

}

