package DS_LAB;

public class Exp8_B {
    static class Node {
        int data;
        Node left, right;
        boolean leftThread, rightThread;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
            this.leftThread = this.rightThread = true; // Initializing as threads
        }
    }
   static class ThreadedBinaryTree {
        private Node root;

        public ThreadedBinaryTree() {
            root = null;
        }

        // In-order traversal of the threaded binary tree
        public void inOrderTraversal() {
            if (root == null) {
                System.out.println("Tree is empty");
                return;
            }

            Node current = leftMost(root);
            while (current != null) {
                System.out.print(current.data + " ");
                if (current.rightThread) {
                    current = current.right;
                } else {
                    current = leftMost(current.right);
                }
            }
            System.out.println();
        }

        // Find the leftmost node in the tree
        private Node leftMost(Node node) {
            if (node == null) {
                return null;
            }
            while (!node.leftThread) {
                node = node.left;
            }
            return node;
        }

        // Insert a new node into the threaded binary tree
        public void insert(int data) {
            Node newNode = new Node(data);
            if (root == null) {
                root = newNode;
                return;
            }

            Node parent = null, current = root;
            while (current != null) {
                parent = current;
                if (data < current.data) {
                    if (!current.leftThread) {
                        current = current.left;
                    } else {
                        break;
                    }
                } else {
                    if (!current.rightThread) {
                        current = current.right;
                    } else {
                        break;
                    }
                }
            }

            if (data < parent.data) {
                newNode.left = parent.left;
                newNode.right = parent;
                parent.leftThread = false;
                parent.left = newNode;
            } else {
                newNode.left = parent;
                newNode.right = parent.right;
                parent.rightThread = false;
                parent.right = newNode;
            }
        }

        // Delete a node from the threaded binary tree
        public void delete(int data) {
            Node parent = null, current = root;
            boolean found = false;

            while (current != null) {
                if (data == current.data) {
                    found = true;
                    break;
                }
                parent = current;
                if (data < current.data) {
                    if (!current.leftThread) {
                        current = current.left;
                    } else {
                        break;
                    }
                } else {
                    if (!current.rightThread) {
                        current = current.right;
                    } else {
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("Node not found");
                return;
            }

            // Case 1: Node to be deleted has no children
            if (current.leftThread && current.rightThread) {
                if (parent == null) {
                    root = null;
                } else if (current == parent.left) {
                    parent.leftThread = true;
                    parent.left = current.left;
                } else {
                    parent.rightThread = true;
                    parent.right = current.right;
                }
            }

            // Case 2: Node to be deleted has one child
            else if (current.leftThread || current.rightThread) {
                Node child = current.leftThread ? current.right : current.left;
                if (parent == null) {
                    root = child;
                } else if (current == parent.left) {
                    parent.left = child;
                    if (current.leftThread) {
                        child.left = current.left;
                    } else {
                        child.right = current.right;
                    }
                } else {
                    parent.right = child;
                    if (current.rightThread) {
                        child.right = current.right;
                    } else {
                        child.left = current.left;
                    }
                }
            }

            // Case 3: Node to be deleted has two children
            else {
                Node successorParent = current;
                Node successor = current.right;
                while (!successor.leftThread) {
                    successorParent = successor;
                    successor = successor.left;
                }
                current.data = successor.data;
                if (successor.leftThread && successor.rightThread) {
                    if (successorParent == current) {
                        successorParent.rightThread = true;
                        successorParent.right = successor.right;
                    } else {
                        successorParent.leftThread = true;
                        successorParent.left = successor.left;
                    }
                } else {
                    Node child = successor.leftThread ? successor.right : successor.left;
                    if (successorParent == current) {
                        successorParent.right = child;
                    } else {
                        successorParent.left = child;
                    }
                }
            }
        }
        public static void main(String[] args) {
            ThreadedBinaryTree tbt = new ThreadedBinaryTree();
            tbt.insert(20);
            tbt.insert(10);
            tbt.insert(30);
            tbt.insert(5);
            tbt.insert(15);
            tbt.insert(25);
            tbt.insert(35);

            System.out.print("In-order traversal: ");
            tbt.inOrderTraversal();

            System.out.println("Deleting 15");
            tbt.delete(15);
            System.out.print("In-order traversal: ");
            tbt.inOrderTraversal();

            System.out.println("Deleting 20");
            tbt.delete(20);
            System.out.print("In-order traversal: ");
            tbt.inOrderTraversal();

            System.out.println("Deleting 30");
            tbt.delete(30);
            System.out.print("In-order traversal: ");
            tbt.inOrderTraversal();
        }
    }
}
