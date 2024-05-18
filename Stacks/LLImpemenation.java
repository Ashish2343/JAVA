package Stacks;

public class LLImpemenation {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
        public static class Stack{
            Node head = null;
            int size =0;
            void push(int val){
                Node temp = new Node(val);
                temp.next = head;
                head = temp;
                 size++;
            }
            int peek(){
                return head.val;
            }
            int pop(){
                Node temp =head;
                head =head.next;
                size--;
                return temp.val;
            }
            void display(){
                Node temp  =head;
                while (temp != null){
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        Stack st  =new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.display();

    }
}
