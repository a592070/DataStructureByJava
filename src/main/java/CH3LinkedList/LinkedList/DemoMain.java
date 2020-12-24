package CH3LinkedList.LinkedList;

public class DemoMain {
    public static void main(String[] args) {
        DemoLinkedList list = new DemoLinkedList();
        list.insert("Mr.A");
        list.insert("Mr.B");
        list.insert("Mr.C");
        list.insert("Mr.D");
        list.print();

        list.insert("Mr1",0);
        list.insert("Mr2",3);
        list.insert("Mr3",3);

        for (int i = 0; i < list.len(); i++) {
            System.out.println(i+" : "+list.getNode(i));
        }

        System.out.println("----------------------------------------------");
        list.reverse();
        list.print();
        System.out.println("last : "+list.getLast());
        System.out.println("first : "+list.getFirst());

//        Node tmp = list.delete(1);
//        System.out.println(list.len);
//        System.out.println("1 : "+tmp);
//        int i = list.len();
//        for (int j = 0 ; j < i; j++){
//            int tmp = 0;
//            System.out.println(list.len());
//            System.out.println(list.delete(list.len()-1));
//        }
//        System.out.println(list.len());

    }
}
