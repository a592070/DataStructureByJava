package CH5Queue.QueuePriority;

public class QueueNode {
    int data;
    int priority;
    QueueNode next;
    QueueNode previous;

    public QueueNode(int data , int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
        this.previous = null;
    }
}
