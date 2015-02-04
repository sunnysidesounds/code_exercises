package LinkedLists.LinkedListMiddleExercise;

/**
 * How do you find middle element of a linked list in single pass?
 */

public class linkedListMiddle {
    public Node head;
    public int count;

    /**
     * Constructor
     */
    public linkedListMiddle(){
        head = new Node(null);
        count = 0;
    }

    public static void main(String[] args){
        //Setup LinkedList with data
        int len = 51;
        linkedListMiddle m = new linkedListMiddle();
        for(int i = 1; i <= len; i++){
            m.add(i);
        }
        System.out.println("Original List: " + m.toString());
        System.out.println("Size: " + m.count);

        //Find the middle of a linkedList
        System.out.println("");
        System.out.println(m.findMiddle());

    }

    /**
     * Find the middle value in linkedList
     * @return Object
     */
    public Object findMiddle(){
        Node current = head;
        Node middle = head;
        int c = 0;
        while(current.next != null){
            c++;
            current = current.next;
            if(c%2 == 0) {
                middle = middle.next;
            }
        }
        if(c%2 == 1){
            middle = middle.next;
        }
        return middle.value;
    }


    /**
     * Add a value to the tail of the linked list
     * @param value to add to linked list
     */
    public void add(Object value){
        Node temp = new Node(value);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = temp;
        count++;
    }

    /**
     * Convert linked list nodes to string values
     * @return String value
     */
    public String toString(){
        Node current = head.next;
        String output = "";
        while(current != null){
            output += "[" + current.value.toString() + "]";
            current = current.next;
        }
        return output;
    }

}
