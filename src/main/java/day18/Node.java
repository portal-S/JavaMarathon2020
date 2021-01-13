package day18;

public class Node {
    private Node left;
    private Node right;
    private int value;

    public Node(int value, Node left, Node right) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public void setRight(Node right){
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void addNode(int value, Node root){
        if(root == null) throw new NullPointerException();
        if(value < root.value){
            if(root.left != null){
                addNode(value, root.left);
            } else root.setLeft(new Node(value, null, null));
        } else{
            if(root.right != null){
                addNode(value, root.right);
            } else root.setRight(new Node(value, null, null));
        }
    }

    public static void dfs(Node root){
        if (root != null)
        {
            dfs(root.getLeft());
            System.out.print(root.getValue() + " ");
            dfs(root.getRight());
        }
    }

}
