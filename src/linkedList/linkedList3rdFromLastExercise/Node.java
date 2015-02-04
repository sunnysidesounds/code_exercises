package LinkedList.LinkedList3rdFromLastExercise;


public class Node {
    public Node next;
    public Object value;

    public Node(Object value){
        this.next = null;
        this.value = value;
    }

    @Override
    public String toString(){
        String data = "";
        Node current = this;
        do {
            data += "[" + current.value + "]";
            current = current.next;
        } while (current != null);
        return data;
    }
}
