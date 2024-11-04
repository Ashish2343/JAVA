package DS_LAB;

public class Exp8_B {
    private static class Node{
        Node next;
        int data;
        Node(int data){this.data = data;}
    }
    public static class QueueAsLinkedList{
        Node head = null;
        int size;
        void Enqueue(int data){
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = temp;
            }
            size++;
        }

        void Dequeue(){
            if(isQueueEmpty()){
              throw  new  Error("Queue is Empty");
            }
            head = head.next;
            size--;
        }
        void disp(){
            Node temp =  head;
            for (int i = 0; i <size ; i++) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        Boolean isQueueEmpty(){
            if(size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        QueueAsLinkedList Q = new QueueAsLinkedList();
        Q.Enqueue(1);
        Q.Enqueue(2);
        Q.Enqueue(3);
        Q.Enqueue(4);
        Q.Enqueue(5);
        Q.disp();
        Q.Dequeue();
        Q.disp();
    }
}
