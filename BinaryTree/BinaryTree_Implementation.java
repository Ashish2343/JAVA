package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree_Implementation {
    private static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    static class BinayTree {
            Node root;
        private void traverseTree(Node node) {
            if (node != null) {
                traverseTree(node.left);
                System.out.print(" " + node.val);
                traverseTree(node.right);
            }
        }
    }
    public static void main(String[] args) {
        BinayTree tree = new BinayTree();
        tree.root  = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right  = new Node(4);

        System.out.println("/Binary Tree");
        tree.traverseTree(tree.root);
    }
}
