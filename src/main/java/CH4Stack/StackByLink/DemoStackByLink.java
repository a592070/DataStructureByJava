package CH4Stack.StackByLink;

public class DemoStackByLink {
    private Node front;
    private Node rear;
    int len = 0;

    public boolean isEmpty(){
        return  front == null;
    }
    public void push(String data){
        Node newNode = new Node(data);
        if(!this.isEmpty()){
            rear.next = newNode;
            rear = newNode;
        }else{
            front = newNode;
            front.next = rear;
            rear = newNode;
        }
        len++;
    }
    public String pop(){
        Node tmp;
        if(!this.isEmpty()){
            tmp = rear;
            rear = this.getNode(len-2);
            rear.next = null;
            len--;
            return tmp.toString();
        }else{
            System.err.println("list is empty");
            return "";
        }
    }
    public Node getNode(int index){
        Node current = front;
        int count = 0;
        while(count != index){
            current = current.next;
            count++;
        }
        return current;
    }

    @Override
    public String toString() {
        Node current = front;
        StringBuilder str = new StringBuilder();
        str.append("[");
        while(current != null){
            if(current == rear) {
                str.append(current.data+"]");
            }else{
                str.append(current.data+", ");
            }
            current = current.next;
        }
        return str.toString();
    }
}
