package CH5Queue.QueueByArray;

public class DemoMain {
    public static void main(String[] args) {
        DemoQueueByArray queue = new DemoQueueByArray(10);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.printQueue();

        System.out.println(queue.getFront());

        queue.delete();
        queue.delete();
        queue.delete();

        queue.printQueue();

        System.out.println(queue);

        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.printQueue();
        System.out.println(queue);

        queue.delete();
        queue.delete();

        queue.printQueue();

        System.out.println(queue);
    }
}
