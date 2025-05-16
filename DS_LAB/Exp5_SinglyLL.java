package DS_LAB;

public class Exp5_SinglyLL {
    static class SinglyLinkedList {
        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        Node head = null;
        int size = 0;

        public void insertAtStart(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        void insertAtEnd(int data) {
            Node a = new Node(data);
            Node temp = head;
            if (head == null) {
                head = a;
                a.next = null;
            } else {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = a;
            }
        }

        public void insertAfter(int data, int after) {
            Node current = head;
            while (current != null && current.data != after) {
                current = current.next;
            }
            if (current != null) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
            } else {
                System.out.println("Node with value " + after + " not found.");
            }
        }

        public void deleteFromStart() {
            if (head != null) {
                head = head.next;
            } else {
                System.out.println("List is empty.");
            }
        }

        public void deleteFromEnd() {
            if (head == null) {
                System.out.println("List is empty.");
            } else if (head.next == null) {
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        }

        public void deleteValue(int data) {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
            if (head.data == data) {
                head = head.next;
                return;
            }
            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;
            } else {
                System.out.println("Node with value " + data + " not found.");
            }
        }

        public boolean search(int data) {
            Node current = head;
            while (current != null) {
                if (current.data == data) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtStart(3);
        list.insertAtEnd(5);
        list.insertAtEnd(8);
        list.insertAfter(7, 5);
        list.display();

        list.deleteFromStart();
        list.display();

        list.deleteFromEnd();
        list.display();

        list.deleteValue(7);
        list.display();

        System.out.println(list.search(5));
    }

}
