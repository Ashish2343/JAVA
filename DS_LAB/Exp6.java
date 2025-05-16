package DS_LAB;


public class Exp6 {
    private static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
   public static class StackAsLinkedList{

        Node head;
        Node tail = null;
        int size = 0;
       public StackAsLinkedList(){head = null;}
        void push(int data){
            Node temp = new Node(data);
            if(head == null) {
                temp.data = data;
                head = temp;
                tail = temp;
                size++;
            }else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
                tail.next = null;
                size++;
            }
        }
        void disp(){
            Node temp = tail;
            for (int i = 0; i <size ; i++) {
                System.out.print(temp.data + " ");
                temp =  temp.prev;
        }
        }
        void pop(){
           if(isStackEmpty()){
               throw new Error("Stack is Empty");
           }
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        Boolean isStackEmpty(){
           if(size==0) return true;
           else  return false;
        }

    }
    public static void main(String[] args) {
        StackAsLinkedList st  = new StackAsLinkedList();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.disp();
        st.pop();
        System.out.println();
        st.disp();
    }
}
