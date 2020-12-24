package CH5Queue.QueuePriority;

public class PriorityQueue {
    private QueueNode front;
    private QueueNode rear;

    public PriorityQueue() {
        this.front = null;
        this.rear = null;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public void push(int ele , int priority){
        QueueNode newNode = new QueueNode(ele , priority);
        if(this.isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            QueueNode current = front;
            int currentPriority = current.priority;
            // 當queue只有一個元素
            if(priority > front.priority){
                front.previous = newNode;
                newNode.next = front;
                front = newNode;
            }
            // 當 priority 比 rear 還小
            else if(priority < rear.priority){
                rear.next = newNode;
                newNode.previous = rear;
                rear = newNode;
            }
            // 中間情況
            else {
                while (priority < currentPriority) {
                    current = current.next;
                    currentPriority = current.priority;
                }
                QueueNode tmp = current.previous;
                tmp.next = newNode;
                newNode.previous = tmp;
                newNode.next = current;
                current.previous = newNode;
            }
        }
    }
    public QueueNode pop(){
        QueueNode popNode = front;
        front = popNode.next;
        front.previous = null;
        popNode.next= null;
        return popNode;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");

        QueueNode current = front;
        while(current != rear){
            str.append(current.data + ",");
            current = current.next;
        }
        str.append(current.data + "]");

        return str.toString();
    }

}
