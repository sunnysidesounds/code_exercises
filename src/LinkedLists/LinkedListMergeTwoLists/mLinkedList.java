package LinkedLists.LinkedListMergeTwoLists;

/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */

public class mLinkedList {
    public static void main(String[] args){
        LinkedList ll1 = new LinkedList();
        ll1.insert(1);
        ll1.insert(3);
        ll1.insert(5);
        ll1.insert(7);
        ll1.insert(9);

        System.out.println("List1: " + ll1.toString());

        LinkedList ll2 = new LinkedList();
        ll2.insert(2);
        ll2.insert(4);
        ll2.insert(6);
        ll2.insert(8);
        ll2.insert(10);
        ll2.insert(12);

        System.out.println("List2: " + ll2.toString());


          Node twolist = ll1.mergeTwoLists(ll1.head, ll2.head);

        System.out.println(twolist.toString());


    }

}


class LinkedList {
    public Node head;
    public int counter;

    public LinkedList(){
        head = new Node(0);
    }

    public Node mergeTwoLists(Node l1, Node l2) {
        if(l1 == null && l2 == null){
            return null;
        }

        Node myList = new Node(0);
        Node current = myList;
       while(l1 != null && l2 != null){
            if(l1.value < l2.value){
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null){
            current.next = l1;
        } else {
            current.next = l2;
        }
        System.out.println(current.next.next.value);

        return myList.next;
    }


    public Object get(int value){
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
        return current.value;
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
            o += "[" + current.value + "]";
            current = current.next;
        }
        return o;
    }
}


class Node{
    public int value;
    public Node next;
    public Node(int value){
        this.value = value;
    }
}