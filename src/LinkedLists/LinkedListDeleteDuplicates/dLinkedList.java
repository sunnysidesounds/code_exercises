package LinkedLists.LinkedListDeleteDuplicates;

/*
 Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */

public class dLinkedList {
    public Node head;
    public int counter;

    public static void main(String[] args){
        dLinkedList ll = new dLinkedList();

        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);


        ll.deletePosition(ll.head, 3);


        System.out.println("List: " + ll.toString());

       // ll.deleteDuplicates(ll.head);

       // System.out.println("After duplicate deleted List: " + ll.toString());

    }

    public dLinkedList(){
        head = new Node(null);
    }

    public Node deleteDuplicates(Node head) {
        if(head == null){
            return null;
        }
        Node current = head;
        Node previous = null;

        while(current.next != null){
            previous = current;
            current = current.next;
            if(previous.value == current.value){
                previous.next = current.next;
                current = previous;
            }
        }


        return head;
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


    public Node deletePosition(Node head, int position) {
        // Complete this method
        if(head == null){
            return head;
        }

        int currentPosition = 0;
        Node current = head;
        while(current.next != null && currentPosition != position){

            System.out.println("currentPosition " + currentPosition);
            System.out.println("currentValue " + current.value);
            //System.out.println("position " + position);

            current = current.next;
            currentPosition++;
        }

        System.out.println("currentPosition after " + currentPosition);

        current.next = current.next.next;

        return current;

    }



    public void delete(int value){
        if(head == null){
            return;
        }
        Node current = head;
        Node previous = null;
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
        counter--;
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




}


class Node{
    public Object value;
    public Node next;

    public Node(Object value){
        this.value = value;
    }

}
