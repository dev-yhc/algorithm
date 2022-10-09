package tree;

public class BST {
    public static void main(String[] args) {
        Node root = new Node(50);

        Node.insertRecursive(root, 24);
        Node.insertRecursive(root, 42);
        Node.insertRecursive(root, 33);
        Node.insertRecursive(root, 22);

        Node.insertRecursive(root, 55);
        Node.insertRecursive(root, 52);
        Node.insertRecursive(root, 57);

        Node.traverseInOrderRecursive(root);

        System.out.println("---------");

        Node.deleteNodeRecursive(root, 55);
        Node.traverseInOrderRecursive(root);

        System.out.println("---------");
        Node copiedNode = Node.copyRecursive(root);
        Node.traverseInOrderRecursive(copiedNode);

    }
}
