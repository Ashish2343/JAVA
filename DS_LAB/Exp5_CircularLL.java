package DS_LAB;

public class Exp5_CircularLL {
   static class CircularLinkedList {
        private class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        private Node tail;
        public CircularLinkedList() {
            tail = null;
        }
        public boolean isEmpty() {
            return tail == null;
        }
        public void insertAtStart(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                tail = newNode;
                tail.next = tail;
            } else {
                newNode.next = tail.next;
                tail.next = newNode;
            }
        }
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                tail = newNode;
                tail.next = tail;
            } else {
                newNode.next = tail.next;
                tail.next = newNode;
                tail = newNode;
            }
        }
        public void insertAfter(int data, int after) {
            if (isEmpty()) {
                System.out.println("List is empty.");
                return;
            }
            Node current = tail.next;
            do {
                if (current.data == after) {
                    Node newNode = new Node(data);
                    newNode.next = current.next;
                    current.next = newNode;
                    if (current == tail) {
                        tail = newNode;
                    }
                    return;
                }
                current = current.next;
            } while (current != tail.next);
            System.out.println("Node with value " + after + " not found.");
        }
        public void deleteFromStart() {
            if (isEmpty()) {
                System.out.println("List is empty.");
                return;
            }
            if (tail.next == tail) {
                tail = null;
            } else {
                tail.next = tail.next.next;
            }
        }
        public void deleteFromEnd() {
            if (isEmpty()) {
                System.out.println("List is empty.");
                return;
            }
            if (tail.next == tail) {
                tail = null;
            } else {
                Node current = tail.next;
                while (current.next != tail) {
                    current = current.next;
                }
                current.next = tail.next;
                tail = current;
            }
        }
        public void deleteValue(int data) {
            if (isEmpty()) {
                System.out.println("List is empty.");
                return;
            }
            Node current = tail.next;
            Node prev = tail;
            do {
                if (current.data == data) {
                    if (current == tail.next) {
                        tail.next = current.next;
                    } else {
                        prev.next = current.next;
                    }
                    if (current == tail) {
                        tail = prev;
                    }
                    return;
                }
                prev = current;
                current = current.next;
            } while (current != tail.next);
            System.out.println("Node with value " + data + " not found.");
        }
        public boolean search(int data) {
            if (isEmpty()) {
                return false;
            }
            Node current = tail.next;
            do {
                if (current.data == data) {
                    return true;
                }
                current = current.next;
            } while (current != tail.next);
            return false;
        }
        public void display() {
            if (isEmpty()) {
                System.out.println("List is empty.");
                return;
            }
            Node current = tail.next;
            do {
                System.out.print(current.data + " -> ");
                current = current.next;
            } while (current != tail.next);
            System.out.println("(back to start)");
        }
        public static void main(String[] args) {
            CircularLinkedList list = new CircularLinkedList();
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
            System.out.println(list.search(7));

            list.insertAtStart(2);
            list.insertAtStart(1);
            list.display();
        }
    }
}
