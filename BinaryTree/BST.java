package BinaryTree;

public class BST {
    private static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data = data;
            Node left = null;
            Node right =  null;
        }
    }   static class BinaryTree {

        Node BST(Node root, int val) {
            if(root == null){
                root = new Node(val);
                return root;
            }   if(root.data > val) root.left = BST(root.left,val);
                else root.right = BST(root.right,val);
                return root;
        }
        boolean search(Node root ,int key){
              if(root == null) return false;
              if(root.data > key) return search(root.left,key);
              else if (root.data == key) return true;
              else return search(root.right,key);

        }
        Node delete(Node root , int val){
            if(root.data > val) root.left = delete(root.left,val);
            else if (root.data < val) root.right = delete(root.right,val);
            else {  // root.data = val
                // case 1
                if(root.left == null && root.right == null) return null;
                //case 2
                if(root.left == null)  return root.right;
                else if(root.right == null) return root.left;

                // case 3
                Node IS  =  inorderSuccessor(root.right);
                root.data = IS.data;
                delete(root.right,IS.data);
            }
            return root;
        }
        Node inorderSuccessor(Node root){
                while (root.left != null) root = root.left;
                return root;
        }
        void inorder(Node root){
            if (root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            Node root = null;
            int [] arr = {5,1,3,4,2,7};
            for (int i = 0; i < arr.length ; i++) {
                    root = tree.BST(root,arr[i]);
            }
            tree.inorder(root);
            System.out.println();
            System.out.println(tree.search(root,38));
        }
}
