package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleBinaryTree {
    private static class Node{
            int data;
            Node left;
            Node right;

            Node(int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
            static class BinayTree  {
            static  int idx = -1;
                 Node buildTree(int node[]){
                    idx++;
                    if(idx >= node.length || node[idx] == -1){
                        return null;
                    }
                    Node newNode = new Node(node[idx]);
                    newNode.left =  buildTree(node);
                    newNode.right = buildTree(node);

                   return newNode;
                }
                void preorder(Node root){
                    if (root == null){
                        return;
                    }
                    System.out.print(root.data + " ");
                    preorder(root.left);
                    preorder(root.right);
                }
                void inorder(Node root){
                    if (root == null){
                        return;
                    }
                    inorder(root.left);
                    System.out.print(root.data + " ");
                    inorder(root.right);
                }
                void postorder(Node root){
                    if (root == null){
                        return;
                    }
                    postorder(root.left);
                    postorder(root.right);
                    System.out.print(root.data + " ");
                }
                void levelorder(Node root){
                    Queue<Node> q = new LinkedList<>();
                    q.add(root);
                    q.add(null);
                    while(!q.isEmpty()){
                        Node currNode = q.remove();
                        if(currNode == null){
                            System.out.println();
                            if (q.isEmpty()){
                                break;
                            }else {
                                q.add(null);
                            }
                        }else {
                            System.out.print(currNode.data + " ");
                            if(currNode.left != null){
                                q.add(currNode.left);
                            }if(currNode.right != null){
                                q.add(currNode.right);
                            }
                        }
                    }
                }
            int countofNodes(Node root){
                if(root == null)   return 0;
                int leftCount = countofNodes(root.left);
                int rightCount = countofNodes(root.right);
                return leftCount+rightCount+1;
            }
            int countSum(Node root){
                     if(root == null) return 0;
                     int leftCount = countSum(root.left);
                     int rightCount = countSum(root.right);

                     return leftCount + rightCount + root.data;
            }
            int Height(Node root){
                     if(root == null) return 0;
                     int leftHeight = Height(root.left);
                     int rightHeight = Height(root.right);
                     int maxHeight = Math.max(leftHeight,rightHeight) + 1;

               
                     return maxHeight;
            }
            int diameter(Node root){    // O(N^2)
                     if(root == null) return 0;
                     int diam1 = diameter(root.left);
                     int diam2 = diameter(root.right);
                     int diam3 = Height(root.left) + Height(root.right) + 1;

                     return Math.max(diam3,Math.max(diam1,diam2));
            }   

    }
    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1};
        BinayTree tree = new BinayTree();
        Node root = tree.buildTree(nodes);
       // System.out.println(root.data);
//        tree.preorder(root);
//        System.out.println();
//        tree.inorder(root);
//        System.out.println();
//        tree.postorder(root);
//        tree.levelorder(root);
//        System.out.println(tree.countofNodes(root));
//        System.out.println(tree.countSum(root));
//        System.out.println(tree.Height(root));
        System.out.println(tree.diameter(root));
    }
}
