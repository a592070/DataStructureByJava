package CH6Tree.BinaryTree;

public class Node {
    Node rootNode;
    Node leftNode;
    Node rightNode;

    String value;

    public Node() {
        this("Nope");
    }
    public Node(String value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public void setRoot(Node root){
        this.rootNode = root;
    }

    public String getValue(){
        return this.value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
