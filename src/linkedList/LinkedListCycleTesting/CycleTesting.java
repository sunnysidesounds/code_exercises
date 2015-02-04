package LinkedList.LinkedListCycleTesting;

public class CycleTesting {
    public Node head;
    public int count;

    public CycleTesting(){
        head = new Node(null);
        count = 0;
    }


    public static void main(String[] args){

        CycleTesting ct = new CycleTesting();
        int len = 50;

        for(int i = 1; i<=len; i++){
            ct.add(i);
        }

        System.out.println("Cycling testing");
        System.out.println("Original List: " + ct.toString());
        System.out.println(ct.cycle());








    }


    public Object cycle(){
        Node current = head;
        Node cycle = head;
        int counter = 0;
        while(current.next != null){
            counter++;
            current = current.next;



          //  System.out.println("counter: " + counter);
            System.out.println("current: " + current.value);
            if(counter % 3 == 0){
                cycle = cycle.next;
                System.out.println("cycle: " + cycle.value);
            }


        }





       return current.value;
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
