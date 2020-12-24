package CH5Queue.QueueByLinked;

public class QueueLinkedList {
    QueueNode front;
    QueueNode rear;

    public QueueLinkedList() {
        front = null;
        rear = null;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void add(int ele){
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
    public int delete(){
        int delNum = 0;
        if(this.isEmpty()) {
            System.err.println("Empty queue");
        }else{
            delNum = front.data;
            front = front.next;
            front.previous = null;
        }
        return delNum;
    }
    public int getFront(){
        return front.data;
    }
    @Override
    public String toString(){
        if(this.isEmpty()) return "";
        StringBuilder str = new StringBuilder();
        str.append("[");
        QueueNode current = front;
        while(current != rear){
            str.append(current.data + ",");
            current = current.next;
        }
        str.append(current.data+"]");
        return str.toString();
    }

}
