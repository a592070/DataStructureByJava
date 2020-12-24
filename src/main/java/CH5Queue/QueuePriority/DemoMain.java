package CH5Queue.QueuePriority;

public class DemoMain {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.push(5,5);
        queue.push(15,15);
        queue.push(10,10);
        queue.push(7,7);
        queue.push(12,12);
        System.out.println(queue);

        System.out.println(queue.pop().data);
        System.out.println(queue.pop().data);
        System.out.println(queue.pop().data);
        System.out.println(queue);

        queue.push(20,20);
        queue.push(3,3);
        queue.push(6,6);
        System.out.println(queue);
    }
}
