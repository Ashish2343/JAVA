package DS_LAB;

public  class Exp5_DoublyLL {
    static class DoublyLinkedList {
        private class Node {
            int data;
            Node next;
            Node prev;

            Node(int data) {
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }
        private Node head;
        private Node tail;
        public DoublyLinkedList() {
            head = null;
            tail = null;
        }
        public void insertAtStart(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode;
            } else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
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
                newNode.prev = current;
                if (current.next != null) {
                    current.next.prev = newNode;
                }
                current.next = newNode;
                if (current == tail) {
                    tail = newNode;
                }
            } else {
                System.out.println("Node with value " + after + " not found.");
            }
        }
        public void deleteFromStart() {
            if (head == null) {
                System.out.println("List is empty.");
            } else {
                if (head.next != null) {
                    head = head.next;
                    head.prev = null;
                } else {
                    head = tail = null;
                }
            }
        }
        public void deleteFromEnd() {
            if (tail == null) {
                System.out.println("List is empty.");
            } else {
                if (tail.prev != null) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    head = tail = null;
                }
            }
        }
        public void deleteValue(int data) {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
            Node current = head;
            while (current != null && current.data != data) {
                current = current.next;
            }
            if (current != null) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
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
                System.out.print(current.data + " <-> ");
                current = current.next;
            }
            System.out.println("null");
        }
        public void displayReverse() {
            Node current = tail;
            while (current != null) {
                System.out.print(current.data + " <-> ");
                current = current.prev;
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
            DoublyLinkedList list = new DoublyLinkedList();
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
            list.displayReverse();
        }
    }
}
