package DS_LAB;

public class Exp4_A {
    public static class CircularQueue{
        private int[] queue;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        public CircularQueue(int capacity) {
            this.capacity = capacity;
            this.queue = new int[capacity];
            this.front = -1;
            this.rear = -1;
            this.size = 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void enqueue(int data) {
            if (isFull()) {
                throw new Error("Queue is full. Cannot enqueue.");
            }
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % capacity;
            queue[rear] = data;
            size++;
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new Error("Queue is empty. Cannot dequeue.");
            }
            int data = queue[front];
            front = (front + 1) % capacity;
            size--;
            if (isEmpty()) {
                front = -1;
                rear = -1;
            }
            return data;
        }

        public void peek() {
            if (isEmpty()) {
                throw new Error("Queue is empty. Cannot peek.");
            }
            System.out.println(queue[front]);
        }
    }
    public static void main(String[] args) {
        CircularQueue Q = new CircularQueue(5);

        Q.enqueue(1);
        Q.enqueue(2);
        Q.enqueue(3);
        Q.enqueue(4);
        Q.enqueue(5);

        System.out.println("Dequeue: " + Q.dequeue());
        System.out.println("Dequeue: " + Q.dequeue());

        Q.peek();


    }
}
