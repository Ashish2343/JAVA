package HashMap;
import java.util.*;
public class IntersectionArray {
    public static void main(String[] args) {
        int [] arr1 = {7,3,9};
        int [] arr2  = {6,3,9,2,9,4};
        Intersection(arr1,arr2);
        Intersection2(arr1,arr2);

    }
    public static void Intersection(int [] arr1, int [] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i <arr2.length ; i++) {
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println(count);
    }

    public static void Intersection2(int [] arr1, int [] arr2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }
        for (int i = 0; i <arr2.length ; i++) {
            if(set1.contains(arr2[i])){
                set3.add(arr2[i]);
                set1.remove(arr2[i]);
            }
        }
        System.out.println(set3);
    }

}
