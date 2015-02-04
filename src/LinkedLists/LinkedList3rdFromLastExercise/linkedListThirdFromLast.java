package LinkedLists.LinkedList3rdFromLastExercise;

/*
How do you find 3rd element from last in single pass?
 */

public class linkedListThirdFromLast {
    public Node head;
    public int count;

    /**
     * Constructor
     */
    public linkedListThirdFromLast(){
        head = new Node(null);
        count = 0;
    }

    public static void main(String[] args){

        int nthValue = 3;

        // Create LinkedList, adding node values based on the given length
        linkedListThirdFromLast m = new linkedListThirdFromLast();
        int len = 20;
        for(int i = 1; i <= len; i++ ){
         m.add(i);

        }
        System.out.println("Original List: " + m.toString());
        System.out.println("Nth value: " + m.findNthValue(nthValue));
    }

    public Object findNthValue(int index){
        Node current = head;
        Node nth = head;
        for(int i = 1; i < index; i++){
              nth = nth.next;
        }
        while(nth.next != null){
            nth = nth.next;
            current = current.next;
        }
        return current;
    }


    /**
     * Add a value to the tail of the linked list
     * @param value to add to linked list
     */
    public void add(Object value){
        Node tmp = new Node(value);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = tmp;
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
