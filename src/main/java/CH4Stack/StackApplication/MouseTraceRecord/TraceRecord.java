package CH4Stack.StackApplication.MouseTraceRecord;

public class TraceRecord {
    Node first;
    Node last;


    public boolean isEmpty(){
        return first == null;
    }
    public void insert(int x , int y){
        Node newNode = new Node(x, y);
        if(this.isEmpty()){
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
    }
    public void delete(){
        if(this.isEmpty()){
            System.err.println("Empty list");
        }else{
            Node tmp = last.previous;

            last = tmp;
            tmp.next = null;
        }
    }

    @Override
    public String toString() {
        Node current  = first;
        StringBuilder str = new StringBuilder();
        str.append("[");
        while(current != last){
            str.append(current+" , ");
            current = current.next;
        }
        str.append(current+"]");
        return str.toString();
    }
}
