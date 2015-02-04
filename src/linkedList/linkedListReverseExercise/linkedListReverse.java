package LinkedList.LinkedListReverseExercise;

/**
 * How to you reverse a linkedlist without using another data structure (recursively / iteratively)
 */

public class linkedListReverse {

    public static void main(String[] args){
        Node node = new Node(5);
        node.next = new Node(4);
        node.next.next = new Node(3);
        node.next.next.next = new Node(2);
        node.next.next.next.next = new Node(1);

        System.out.println("Original List: " + node.toString());
        System.out.println("Recursively Reverse List: " + reverseRecursive(node));
        System.out.println("Iteratively Reverse List: " + reverseRecursive(node));
    }

    public static Node reverseRecursive(Node node){
        if(node == null || node.next == null){
            return node;
        }

        Node remainingNodes = reverseRecursive(node.next);
        Node current = remainingNodes;
        while(current.next != null){
            current = current.next;
            System.out.println("Current: " + current.toString());
        }
        current.next = node;
        node.next = null;
        System.out.println("Remain Node: " + remainingNodes.toString());

        System.out.println("");


        return remainingNodes;
    }

    public static Node reverseIterative(Node node){
        if(node == null || node.next == null){
            return node;
        }
        Node previous = null;
        Node current = node;
        while(current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }


}
