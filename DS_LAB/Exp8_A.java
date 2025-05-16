package DS_LAB;

public class Exp8_A {
    class TreeNode {
        int value;
        TreeNode left, right;

        public TreeNode(int value) {
            this.value = value;
            left = right = null;
        }
    }

    public class BinaryTree {
        TreeNode root;
        public BinaryTree() {
            root = null;
        }

        public void insert(int value) {
            root = insertRec(root, value);
        }
        private TreeNode insertRec(TreeNode root, int value) {
            if (root == null) {
                root = new TreeNode(value);
                return root;
            }
            if (value < root.value) {
                root.left = insertRec(root.left, value);
            } else if (value > root.value) {
                root.right = insertRec(root.right, value);
            }
            return root;
        }


        public void delete(int value) {
            root = deleteRec(root, value);
        }
        private TreeNode deleteRec(TreeNode root, int value) {
            if (root == null) return root;

            // Traverse the tree to find the node to delete
            if (value < root.value) {
                root.left = deleteRec(root.left, value);
            } else if (value > root.value) {
                root.right = deleteRec(root.right, value);
            } else {
                // Node to be deleted found
                // Case 1: Node has no child or one child
                if (root.left == null) return root.right;
                else if (root.right == null) return root.left;

                // Case 2: Node has two children
                // Get the inorder successor (smallest value in the right subtree)
                root.value = minValue(root.right);

                // Delete the inorder successor
                root.right = deleteRec(root.right, root.value);
            }
            return root;
        }
        // Helper method to find the minimum value node in the subtree
        private int minValue(TreeNode root) {
            int minValue = root.value;
            while (root.left != null) {
                root = root.left;
                minValue = root.value;
            }
            return minValue;
        }

        public void inorder() {
            inorderRec(root);
        }

        private void inorderRec(TreeNode root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.value + " ");
                inorderRec(root.right);
            }
        }

        public void preorder() {
            preorderRec(root);
        }

        private void preorderRec(TreeNode root) {
            if (root != null) {
                System.out.print(root.value + " ");
                preorderRec(root.left);
                preorderRec(root.right);
            }
        }

        public void postorder() {
            postorderRec(root);
        }

        private void postorderRec(TreeNode root) {
            if (root != null) {
                postorderRec(root.left);
                postorderRec(root.right);
                System.out.print(root.value + " ");
            }
        }
    }
    public static void main(String[] args) {
        Exp8_A outerClass = new Exp8_A();
        BinaryTree tree = outerClass.new BinaryTree();

        // Inserting elements
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);    

        System.out.println("Inorder traversal after insertion:");
        tree.inorder();
        System.out.println();

        // Deleting elements
        tree.delete(20);
        System.out.println("Preorder traversal after deleting 20:");
        tree.preorder();
        System.out.println();


        tree.delete(50);
        System.out.println("Postorder traversal after deleting 50:");
        tree.postorder();
        System.out.println();
    }
}


