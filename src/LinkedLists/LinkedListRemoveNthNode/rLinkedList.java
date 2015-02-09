package LinkedLists.LinkedListRemoveNthNode;

import sun.awt.image.ImageWatched;

public class rLinkedList {

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
       // ll.insert(3);
       // ll.insert(4);
       // ll.insert(5);

        System.out.println("List: " + ll.toString() );

        System.out.println("List: " + ll.removeNthFromEnd(ll.head, 2));

        System.out.println("List After: " + ll.toString() );




    }


}


class LinkedList{
    public Node head;
    public int counter;

    public LinkedList(){
        head = new Node(null);
    }

    public Node removeNthFromEnd(Node head, int n) {
        if(head == null){
            return null;
        }
        Node current = head;
        Node previous = head;

        for(int i = 1; i <= n; i++){
            current = current.next;
        }
        if(current == null){
            return head.next;
        }
        while(current.next != null){
            current = current.next;
            previous = previous.next;
        }

        previous.next = previous.next.next;

        return head;

    }


    public String toString(){
        Node current = head.next;
        String o = "";
        while(current != null){
            o += "[" + current.value.toString() + "]";
            current = current.next;
        }
        return o;
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

    public void insert(int value){
        Node newNode = new Node(value);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        counter++;
    }

    public void delete(int value){
        if(head == null){
            return;
        }
        Node current = head;
        Node previous = null;
        while(current.next !=null && value != current.value){
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



}



class Node{
    public Object value;
    public Node next;
    public Node(Object value){
        this.value = value;
    }
}