package LeekCode;

public class ReverseLinkedList {

    /*
    Reverse a singly linked list.


    [4] ---> [3] ---> [2] ---> [5] --->[6]


     */


    public static void main(String[] args){




    }

    public Node reverseList(Node head) {
        if(head == null || head.next == null){
            return null;
        }
        Node previous = null;
        Node current = head;
        while(current.next != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;

        }

        return previous;

    }
}





class Node {
    public int value;
    public Node next;

    public Node(int value){
        this.value = value;
    }


}

