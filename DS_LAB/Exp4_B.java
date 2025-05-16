package DS_LAB;

public class Exp4_B {
      static class PriorityQueue {
        private int[] heap;
        private int size;
        private int capacity;

        public PriorityQueue(int capacity) {
            this.capacity = capacity;
            this.heap = new int[capacity];
            this.size = 0;
        }

        private int getParent(int index) {
            return (index - 1) / 2;
        }

        private int getLeftChild(int index) {
            return 2 * index + 1;
        }

        private int getRightChild(int index) {
            return 2 * index + 2;
        }

        private void swap(int index1, int index2) {
            int temp = heap[index1];
            heap[index1] = heap[index2];
            heap[index2] = temp;
        }

        private void heapifyUp(int index) {
            while (index > 0 && heap[getParent(index)] > heap[index]) {
                swap(getParent(index), index);
                index = getParent(index);
            }
        }

        private void heapifyDown(int index) {
            int smallest = index;
            int leftChild = getLeftChild(index);
            int rightChild = getRightChild(index);

            if (leftChild < size && heap[leftChild] < heap[smallest]) {
                smallest = leftChild;
            }

            if (rightChild < size && heap[rightChild] < heap[smallest]) {
                smallest = rightChild;
            }

            if (smallest != index) {
                swap(index, smallest);
                heapifyDown(smallest);
            }
        }

        public void insert(int value) {
            if (size == capacity) {
                throw new IllegalStateException("Priority queue is full");
            }
            heap[size] = value;
            size++;
            heapifyUp(size - 1);
        }

        public int extractMin() {
            if (size == 0) {
                throw new IllegalStateException("Priority queue is empty");
            }
            int min = heap[0];
            heap[0] = heap[size - 1];
            size--;
            heapifyDown(0);
            return min;
        }

        public int peek() {
            if (size == 0) {
                throw new IllegalStateException("Priority queue is empty");
            }
            return heap[0];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public static void main(String[] args) {
            PriorityQueue pq = new PriorityQueue(10);

            pq.insert(5);
            pq.insert(3);
            pq.insert(8);
            pq.insert(1);

            System.out.println("Min value: " + pq.extractMin());
            System.out.println("Min value: " + pq.extractMin());

            pq.insert(4);

            System.out.println("Min value: " + pq.peek());
            System.out.println("Min value: " + pq.extractMin());
            System.out.println("Min value: " + pq.extractMin());
        }
    }
}
