package CH6Tree.BinaryTree;


// import 也能使用static，只能有static的屬性

import static java.lang.System.console;
import static java.lang.System.out;

public class DemoMain {
    public static void main(String[] args) {
        Node root = new Node();
        Node stageA1 = new Node("A1");
        Node stageA2 = new Node("A2");

        root.leftNode = stageA1;
        root.rightNode = stageA2;
        stageA1.setRoot(root);
        stageA2.setRoot(root);

        out.println();
        console();

    }
}
