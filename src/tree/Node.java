package tree;

public class Node {
    private Node left;
    private Node right;
    private final int data;

    public Node(final int data) {
        this.data = data;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    public int getData() {
        return data;
    }

    public static void traverseInOrderRecursive(Node node) {
        if (node == null) {
            return;
        }

        traverseInOrderRecursive(node.left);
        System.out.println(node.data);
        traverseInOrderRecursive(node.right);
    }

    public static Node insertRecursive(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else {
            root.right = insertRecursive(root.right, data);
        }

        return root;
    }

//    public static int getPredecessorValue(Node root) {
//        Node predecessor = root;
//        while (predecessor.getRight() != null) {
//            predecessor = predecessor.getRight();
//        }
//
//        int predecessorValue = predecessor.data;
//        predecessor = null;
//
//        return predecessorValue;
//    }

    public static Node deleteNodeRecursive(Node root, int data) {
        if (root == null) {
            return null;
        }

        if (data == root.data) {
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                root = root.right;
            }

            if (root.right == null) {
                root = root.left;
            }

            Node newNode = new Node(root.data);
            newNode.left = deleteNodeRecursive(root.left, data);
            newNode.right = root.right;

            return newNode;
        }

        if (data < root.data) {
            root.left = deleteNodeRecursive(root.left, data);
        }

        if (data > root.data) {
            root.right = deleteNodeRecursive(root.right, data);
        }

        if (root.getLeft() == null && root.getRight() == null) {
            return null;
        }

        return root;
    }

    public static Node copyRecursive(final Node root) {
        if (root == null) {
            return null;
        }

        Node newNode = new Node(root.data);
        newNode.left = copyRecursive(root.left);
        newNode.right = copyRecursive(root.right);

        return newNode;
    }
}
