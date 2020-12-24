package CH5Queue.QueueDoubleEnds;

public class Deques {
    private QueueNode front;
    private QueueNode rear;

    public Deques() {
        front = null;
        rear = null;
    }
    public boolean isEmpty(){
        return front==null && rear==null;
    }
    public void addFront(int ele){
        QueueNode newNode = new QueueNode(ele);
        if(this.isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            front.previous = newNode;
            newNode.next = front;
            front = newNode;
        }
    }
    public void addRear(int ele){
        QueueNode newNode = new QueueNode(ele);
        if(this.isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            newNode.previous = rear;
            rear = newNode;
        }
    }
    public QueueNode popFront(){
        QueueNode pop = front;
        if(this.isEmpty()){
            System.err.println("Empty queue");
        }else{
            QueueNode tmp = front.next;
            tmp.previous = null;
            front = tmp;
        }
        return pop;
    }
    public QueueNode popRear(){
        QueueNode pop = rear;
        if(this.isEmpty()){
            System.err.println("Empty queue");
        }else{
            QueueNode tmp = rear.previous;
            tmp.next = null;
            rear = tmp;
        }
        return pop;
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
