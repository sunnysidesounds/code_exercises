package LinkedLists.LinkedListReverseExercise;


public class Node {
    public Node next;
    public int value;

    public Node(int value){
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
