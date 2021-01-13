package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(10, null, null);
        root.addNode(5, root);
        root.addNode(1, root);
        root.addNode(6, root);
        root.addNode(7, root);
        root.addNode(23, root);
        root.addNode(20, root);
        System.out.println(root.getRight().getLeft());
        Node.dfs(root);
    }
}