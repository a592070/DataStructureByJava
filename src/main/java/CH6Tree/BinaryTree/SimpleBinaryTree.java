package CH6Tree.BinaryTree;

public class SimpleBinaryTree {
    Node root;

    public SimpleBinaryTree(String value) {
        this.root = new Node(value);
    }

    public SimpleBinaryTree(Node root) {
        this.root = root;
    }
    public SimpleBinaryTree() {
        this(new Node());
    }

    public boolean isEmpty(){
        return root==null;
    }

}
