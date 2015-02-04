package LinkedLists.LinkedListExercise;


public class Node {
    public Node next;
    public Object data;

    public Node(Object dataValue){
        next = null;
        data = dataValue;
    }

    public Node(Object dataValue, Node nextValue){
      next = nextValue;
      data = dataValue;
    }

    public Object getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

    public void setData(Object dataValue){
        data = dataValue;
    }

    public void setNext(Node nextValue){
        next = nextValue;
    }
}
