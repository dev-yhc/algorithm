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

    public static void traversePreOrderRecursive(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.data);

        traversePreOrderRecursive(node.left);
        traversePreOrderRecursive(node.right);
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
}
