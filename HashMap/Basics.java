package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Basics {
    static void HashmapMethods(){
        // Syntax
        Map<String,Integer> mp = new HashMap<>();
        // Adding Elements
        mp.put("Akash",21);
        mp.put("Kunal",25);
        mp.put("Rohan", 19);
        mp.put("Shlok",26);
        mp.put("Harry",29);
        // Getting value of key from Hashmap
        System.out.println(mp.get("Rohan"));
        // Changing value of key from Hashmap
        mp.put("Kunal",20);
        // Removing a pair from Hashmap
        mp.remove("Shlok");
        // Checking if the key exist in map
        System.out.println(mp.containsKey("Shlok"));
        System.out.println(mp.containsKey("Harry"));
        // Adding a new entry if key doesn't exist already
        mp.putIfAbsent("Aryan", 29);
        // Getting all keys in Hashmap
        System.out.println(mp.keySet());
        // Getting all the values in hashmap
        System.out.println(mp.values());
        // Getting all entries in Hashmap
        System.out.println(mp.entrySet());
        // Traversing through Hashmap
        for(Map.Entry<String, Integer> e: mp.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
    public static void main(String[] args) {
        HashmapMethods();
    }
}
