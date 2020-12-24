package CH5Queue.QueueCircular;

public class CircularQueue {
    private int max;
    int[] queue;
    int front;
    int rear;

    public CircularQueue(int max) {
        this.max = max;
        this.queue = new int[max];
        front = -1;
        rear = -1;
    }
    public boolean isEmpty(){
        return front == rear;
    }
    public boolean isFull(){
        return (rear+1==front || rear==max-1 && front<=0);
    }
    public void add(int ele){
        if(rear < max) {
            if(this.isFull()) System.err.println("add "+ele+" failed, queue is Full");
            else {
                rear++;
                if (rear == max) rear = 0;
                queue[rear] = ele;
            }
        }
    }
    public int delete(){
        int delNum = 0;
        if(this.isEmpty()) {
            System.err.println("queue is empty");
        }else {
            front++;
            if (front == max) front = 0;
            delNum = queue[front];
            queue[front] = 0;
        }
        return delNum;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        int i = front+1;
        while(i!=rear){
            if(i==max) i=0;
            str.append(queue[i]+",");
            i++;
        }
        str.append(queue[i]+"]");
        return str.toString();
    }
}
