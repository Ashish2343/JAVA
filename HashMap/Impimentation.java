package HashMap;

import java.util.LinkedList;

public class Impimentation {

    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final double DEFAULT_LOAD_FACTOR = 0.75;

        private class Node{
            K key;
            V val;
            Node(K key, V val){
                this.key = key;
                this.val =  val;
            }
        }

        private int n;
        private LinkedList<Node> [] buckets;

        private void initBuckets(int N){
            buckets = new LinkedList[N];
            n = 0;
            for (int i = 0; i <buckets.length ; i++) {
                buckets[i] = new LinkedList<>();
            }
        }
        private void rehash(){
            LinkedList<Node> [] oldbuckets = buckets;
            initBuckets(oldbuckets.length *2);
            for(var bucket : buckets){
                for(var node : bucket){
                    put(node.key, node.val);
                }
            }
        }
        private int Hashfun(K key){
            int hc = key.hashCode();
            return (Math.abs(hc))%buckets.length;
        }
        // Traverse through linkedlist and look for a node with key, if found it return it;s index otherwise it return's null
        private int SearchInBucket(LinkedList<Node> bucket, K key ){
            for (int i = 0; i < bucket.size() ; i++) {
                if(bucket.get(i) == key){
                    return i;
                }
            }
            return -1;
        }
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);

        }
        public int size(){      // Number of entries in map
                return n;
        }
        public void put( K key, V val){
            int Bucket_Index = Hashfun(key);
            LinkedList<Node> currBucket = buckets[Bucket_Index];
            int entry = SearchInBucket(currBucket,key);
            if(entry == -1){
                Node node = new Node(key,val);
                currBucket.add(node);
                n++;
            } else{
                Node currnode = currBucket.get(entry);
                currnode.val= val;
            } if(n >= buckets.length * DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }
        public V get(K key){
            int Bucket_Index = Hashfun(key);
            LinkedList<Node> currBucket = buckets[Bucket_Index];
            int entry = SearchInBucket(currBucket,key);
            if(entry != -1){        // key exist
                Node currNode = currBucket.get(entry);
                return currNode.val;
            }else{
                return null;
            }

        }
        public V remove(K key){
            int Bucket_Index = Hashfun(key);
            LinkedList<Node> currBucket = buckets[Bucket_Index];
            int entry = SearchInBucket(currBucket,key);
            if(entry != -1){        // key exist
                Node currNode = currBucket.get(entry);
                V val = currNode.val;
                currBucket.remove(entry);
                n--;
                return val;
            }else{
                return null;
            }
        }

    }

    public static void main(String[] args) {

        MyHashMap<String,Integer> mp = new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        mp.put("d",4);
        mp.put("e",5);
        mp.put("f",6);
        mp.put("g",7);
        System.out.println(mp.size());
    }
}
