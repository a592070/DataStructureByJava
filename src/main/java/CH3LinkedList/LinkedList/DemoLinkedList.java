package CH3LinkedList.LinkedList;

public class DemoLinkedList {
    private Node first;
    private Node last;
//    public int len;
    public Node getFirst(){
        return this.first;
    }
    public Node getLast(){
        return this.last;
    }

    public boolean isEmpty(){
        return first == null;
    }
    public void insert(String data){
        this.insert(data , this.len());
    }
    public void insert(String data , int index){
        Node newNode = new Node(data);
        Node targetNode = this.getNode(index);
        if(this.isEmpty()){
            first = newNode;
            last = newNode;
        }else if(index == 0){
            first = newNode;
            first.next = targetNode;
        }else if(index == this.len()){
            last.next = newNode;
            last = newNode;
        }else{
            this.getNode(index-1).next = newNode;
            newNode.next = targetNode;
        }
    }
    public void print(){
        Node current = first;
        while(current != null){
            if(current == last) {
                System.out.println("["+current.data+"]");
            }else{
                System.out.print("["+current.data+"], ");
            }
            current = current.next;
        }
    }
    public Node getNode(int index){
        if(this.isEmpty()){
            return null;
        }else{
            Node current = first;
            int count = 0;
            while(count != index){
                current = current.next;
                count++;
            }
            return current;
        }
    }
    public Node delete(int index){
        Node delNode = this.getNode(index);
        if(this.first == delNode){
            this.first = this.first.next;

        }else if(this.last == delNode){
            Node current = this.first;
            while(current.next != this.last){
                current = current.next;
            }
            current.next = null;
            this.last = current;

        }else{
            Node current = this.first;
            Node tmp = this.first;
            while(current != delNode){
                tmp = current;
                current = current.next;
            }
            tmp.next = delNode.next;
        }

        return delNode;
    }
    public int len(){
        int count = 0;
        Node current = first;
        while(current != null){
            current = current.next;
            count++;
        }
        return count;
    }
    public void reverse(){
        Node current = first;
        Node previousNode = null;
        Node tmp = null;
        while(current != null){
//            last = previousNode;
//            previousNode = current;
//            current = current.next;
//            previousNode.next = last;

            tmp = previousNode;
            previousNode = current;
            current = current.next;
            previousNode.next = tmp;

        }
        tmp = last;
        last = first;
        first = tmp;
//        current = previousNode;
//        while(current != null){
//            System.out.println("["+current.data+"]");
//            current = current.next;
//        }
    }
}
