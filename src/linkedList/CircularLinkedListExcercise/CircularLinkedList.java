package LinkedList.CircularLinkedListExcercise;

public class CircularLinkedList {
    public Node head;
    public Node tail;
    public int count;

    public static void main(String[] args){
        System.out.println("Circular LinkedList");
        CircularLinkedList cc = new CircularLinkedList();
        cc.add(1);
        cc.add(2);
        cc.add(3);
        cc.add(4);
        cc.add(5);

        System.out.println("Count: " + cc.count);
        System.out.println("Size: " + cc.size());
        System.out.println("List: " + cc.toString());
        cc.delete(1);
        System.out.println("List: " + cc.toString());

    }


    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while(current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        count++;
    }

    public int size(){
        Node current = head;
        int count = 1;
        while(current.next != head){
            current = current.next;
            count++;
        }
        return count;
    }

    public void delete(int value){

        Node current = head;
        if(value == current.value){
            Node start = head;
            Node end = head;

            do{
                end = end.next;
                System.out.println(end.value);
            } while (end.next != start);


            System.out.println("");
            System.out.println(start.value);
            System.out.println(end.value);


        } else {
            Node previous = null;
            while(current.next != head && value != current.value){
                previous = current;
                current = current.next;
            }


            previous.next = current.next;
            count--;

        }








    }





    public String toString(){
        Node current = head;
        String o = "";
        boolean arrow = true;
        do{

            o += (arrow) ? "|" + current.value + "|" : " --> " + "|" + current.value + "|";
            arrow = false;

            current = current.next;

        }while(current!=head);
        return o;
    }


}

class Node {
    public int value;
    public Node next;

    public Node(int value){
        this.value = value;
    }


}
