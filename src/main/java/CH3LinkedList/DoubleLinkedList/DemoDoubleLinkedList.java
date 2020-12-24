package CH3LinkedList.DoubleLinkedList;

public class DemoDoubleLinkedList {
    private Node first;
    private Node last;
    int len;
    public Node getFirst() {
        return first;
    }
    public Node getLast() {
        return last;
    }

    /**
     *  get node by list index
     * @param index
     * @return Node
     */
    public Node getNode(int index) {
        if(!this.isEmpty()){
            if(index > len || index < 0) {
                System.err.println("Out of range");
                return null;
            }
            if(index == this.len-1) return last;
            Node current = first;
            int count = 0;
            while(count != index){
                current = current.next;
                count++;
            }
            return current;
        }else return null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    /**
     *  insert node into list
     *  default to insert last node
     *
     * @param data  Node.data
     */
    public void insert(String data){
        this.insert(data , len);
    }
    public void insert(String data , int index){
        Node newNode = new Node(data);
        Node targetNode = this.getNode(index);
        if(this.isEmpty()){
            first = newNode;
            first.next = last;
            last = newNode;
            last.previous = first;
        }else if(index == 0){
            first.previous = newNode;
            newNode.next = first;
            first = newNode;
        }else if(index == this.len){
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }else{
            Node previousNode = targetNode.previous;

            previousNode.next = newNode;
            newNode.previous = previousNode;
            newNode.next = targetNode;
        }
        this.len++;
    }

    /**
     *  delete node in list by index
     *  default to del last node
     */
    public void delete(){
        this.delete(this.len-1);
    }
    public void delete(int index){
        Node delNode = this.getNode(index);
        if(!this.isEmpty()){
            if(delNode == first){
                first = first.next;
                first.previous = null;
            }else if(delNode == last){
                Node tmp;
                tmp = last.previous;
                last = tmp;
                tmp.next = null;
            }else {
                Node tmp;
                tmp = delNode.previous;
                tmp.next = delNode.next;
                Node tmp2;
                tmp2 = delNode.next;
                tmp2.previous = tmp;
            }
        }
        len--;
    }
    public void reverse(){
        Node tmp = null;
        Node current = last;
        while(current != null){
            tmp = current.previous;
            current.next = tmp;
            current = current.previous;
        }
        tmp = first;
        first = last;
        last = tmp;
    }

    @Override
    public String toString(){
        Node current = first;
        StringBuilder str = new StringBuilder();
        str.append("[");
        while(current != null){
            if(current == last) {
                str.append(current.data+"]");
            }else{
                str.append(current.data+", ");
            }
            current = current.next;
        }
        return str.toString();
    }



}
