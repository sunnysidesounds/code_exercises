package LinkedLists.LinkedListRotateList;



public class rLinkedList {

    public static void main(String[] args){


    }
}

class LinkedList{
    public Node head;

    public LinkedList(){
        head = new Node(null);
    }

    public void insert(int value){
        Node newNode = new Node(value);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void delete(int value){
        if(head == null){
            return;
        }
        Node previous = null;
        Node current = head;
        while(current.next != null && value != current.value){
            previous = current;
            current = current.next;
        }
        if(previous == null){
            head = head.next;
            return;
        }
        if(current.next == null){
            previous.next = null;
            return;
        }
        previous.next = current.next;
    }

    public Node get(int value){
        if(head == null){
            return null;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
            if(value == current.value){
                break;
            }
            if(current.next == null){
                return null;
            }
        }
        return current;
    }

}


class Node {
    public Node next;
    public Object value;
    public Node(Object value){
        this.value = value;
    }
}
