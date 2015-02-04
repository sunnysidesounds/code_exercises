package LinkedList.LinkedListExcercise2;

public class vLinkedList {
    public Node head;
    public int countNodes;

    public static void main(String[] args){
        vLinkedList ll = new vLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(10);


        System.out.println("Number of nodes: " + ll.countNodes + " " + ll.toString());

     //   ll.delete(2);
     //   System.out.println("After delete number of nodes: " + ll.countNodes + " " + ll.toString());

     //   System.out.println("Getting value: " + ll.get(2));

        System.out.println("Remove every other, return last node: " + ll.removeEveryOtherReturnLastNode());



    }

    public vLinkedList(){
        head = new Node(null);
        countNodes = 0;
    }

    public int size(){
        return countNodes;
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

    public void add(Object value){
        Node newNode = new Node(value);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        countNodes++;
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
        countNodes--;
    }

    public Object removeEveryOtherReturnLastNode(){
        if(head == null){
            return null;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
            current.next = current.next.next;
        }
        return current.value;
    }


    public void removeEvens(){
        if(head == null){
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
            current.next = current.next.next;
            System.out.println("Node: " + current.value);
        }
    }

    public void removeOdds(){
        if(head == null){
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next.next;
            System.out.println("Node: " + current.value);
        }
    }

}




class Node{
    public Node next;
    public Object value;

    public Node(Object value){
        this.next = null;
        this.value = value;
    }


}
