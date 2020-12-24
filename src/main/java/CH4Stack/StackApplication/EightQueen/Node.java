package CH4Stack.StackApplication.EightQueen;

public class Node {
    int x;
    int y;
    Node next;
    Node previous;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
        next = null;
        previous = null;
    }

    @Override
    public String toString() {
        return "{" +x +y + '}';
    }
}
