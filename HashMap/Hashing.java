package HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        // Syntax
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(1);
                    // [1,2,3,5]
        // Search - contain
        if(set.contains(1)){
            System.out.println("Set contain 1");
        }
        if(!set.contains(6)){
            System.out.println("Do not contain");
        }

        // Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("1 is deleted");
        }

        // Size
        System.out.println(set.size());

        // Print all element
        System.out.println(set);

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
