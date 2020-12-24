package CH3LinkedList.DoubleLinkedList;

public class DemoMain {
    public static void main(String[] args) {
        DemoDoubleLinkedList list = new DemoDoubleLinkedList();
        list.insert("1");
        list.insert("2");
        list.insert("3",0);
        list.insert("4");
        list.insert("5");
        list.insert("6");
        list.insert("7");
        System.out.println(list.toString());
        System.out.println(list.len);

        list.delete(0);
        list.delete(list.len-1);
        list.delete(3);
        list.delete();
        System.out.println(list);

        list.reverse();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);

        list.insert("1");
        list.insert("2");
        list.insert("3",0);
        list.insert("4");
        list.insert("5");
        list.insert("6");
        list.insert("7");
        System.out.println(list.toString());
        System.out.println(list.len);

        list.delete(0);
        list.delete(list.len-1);
        list.delete(3);
        list.delete();
        System.out.println(list);

    }
}
