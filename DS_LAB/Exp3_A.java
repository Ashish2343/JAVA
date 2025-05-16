package DS_LAB;

public class Exp3_A {
     static class Stack {
        private int[] arr;
        private int count;

        public Stack(int size) {
            arr = new int[size];
            count = 0;
        }

        public void push(int element){
            if(count>= arr.length){
                throw new Error("Stack is Full");
            }
            arr[count] = element;
            count++;
        }
        public int  pop(){
            if(count<=0){
                throw new Error("Stack is Empty");
            }
            count--;
            int out = arr[count];
            return out;
        }
        public void disp(Stack st){
            for (int i = st.count-1; i >= 0; i--) {
                System.out.print(st.arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.disp(st);
        st.pop();
        st.disp(st);
    }
}
