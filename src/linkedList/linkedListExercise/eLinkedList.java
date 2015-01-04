package linkedList.linkedListExercise;


public class eLinkedList {
    private Node head;
    private int listCount;

    /**
     * Constructor
     */
    public eLinkedList(){
        head = new Node(null);
        listCount = 0;
    }

    /**
     * Get the head of LinkedList
     * @return Object
     */
    public Object getHead(){
        Node current = head.getNext();
        return current.getData();
    }

    /**
     * Get the middle of the LinkedList
     * @return Object
     */
    public Object getMiddle(){
        int middleIndex = size() / 2;
        return get(middleIndex);
    }

    /**
     * Get the tail of LinkedList
     * @return Object
     */
    public Object getTail(){
        return get(size());
    }

    /**
     * This get a value based on the provided index value.
     * @param index value of the node we are getting.
     * @return Object
     */
    public Object get(int index){
        if(index <= 0){
            return null;
        }
        Node current = head.getNext();
        for(int i = 1; i < index; i++){
            if(current.getNext() == null){
                return null;
            }
            current = current.getNext();
        }
        return current.getData();
    }

    /**
     * This removes a value based on the provided index value
     * @param index value of the node we are removing
     * @return true/false did we remove
     */
    public boolean remove(int index){
        if(index < 1 || index > size()){
            return false;
        }
        Node current = head;
        for(int i = 1; i < index; i++){
            if(current.getNext() == null){
                return false;
            }
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }

    /**
     * Gets the size of the the Linked List
     * @return int count of all nodes
     */
    public int size(){
        return listCount;
    }

    /**
     * Adds a node to the tail of the LinkedList
     * @param data in the node
     */
    public void add(Object data){
        Node temp = new Node(data);
        Node current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        listCount++;
    }

    /**
     * Adds a node to a given index of the LinkedList
     * @param data in the node
     * @param index value of the node we are adding
     */
    public void add(Object data, int index){
        Node temp = new Node(data);
        Node current = head;
        for(int i = 1; i < index && current.getNext() != null; i++){
            current = current.getNext();
        }

        temp.setNext(current.getNext());
        current.setNext(temp);
        listCount++;
    }

    /**
     * Converts LinkedList into a String version.
     * @return String
     */
    public String toString(){
        Node current = head.getNext();
        String output = "";
        while(current != null){
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return output;
    }

}

