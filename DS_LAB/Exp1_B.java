package DS_LAB;
import java.util.Arrays;
public class Exp1_B {
   static class FixedSizeArray {
        private int[] arr;
        private int count;

        public FixedSizeArray(int size) {
            arr = new int[size];
            count = 0;
        }

        public void insertAtStart(int element) {
            if (count >= arr.length) {
                System.out.println("Array is full, cannot insert element.");
                return ;
            }
            for (int i = count; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = element;
            count++;
            return;
        }

        public void insertAtEnd(int element) {
            if (count >= arr.length) {
                System.out.println("Array is full, cannot insert element.");
                return ;
            }
            arr[count] = element;
            count++;
            return;
        }

        public void insertAtPosition(int element, int position) {
            if (position < 0 || position > count) {
                System.out.println("Position out of bounds.");
                return ;
            }
            if (count >= arr.length) {
                System.out.println("Array is full, cannot insert element.");
                return;
            }
            for (int i = count; i > position; i--) {
                arr[i] = arr[i - 1];
            }
            arr[position] = element;
            count++;
            return ;
        }

        public void delete(int position){
            if (position < 0 || position > count) {
                System.out.println("Position out of bounds.");
                return ;
            }
            for (int i = position; i < count-1 ; i++) {
                arr[i] = arr[i+1];
            }
            arr[count-1] = 0;
            count--;
        }

        public void printArray() {
            System.out.print("Array: ");
            for (int i = 0; i < count; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FixedSizeArray fixedArray = new FixedSizeArray(5);

        fixedArray.insertAtEnd(1);
        fixedArray.insertAtEnd(2);
        fixedArray.insertAtEnd(3);
        fixedArray.printArray();

        fixedArray.insertAtStart(0);
        fixedArray.printArray();

        fixedArray.insertAtPosition(9, 2);
        fixedArray.printArray();

        fixedArray.insertAtEnd(10);


        fixedArray.delete(3);
        fixedArray.printArray();
    }
}



