package CH5Queue.QueueByLinked;

public class QueueNode {
    int data;
    QueueNode next;
    QueueNode previous;

    public QueueNode(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
