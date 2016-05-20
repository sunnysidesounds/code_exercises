package LinkedLists.LinkedListReverseExercise;

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
       // System.out.println("Recursively Reverse List: " + reverseRecursive(node));
        //System.out.println("Iteratively Reverse List: " + reverseIterative(node).toString());

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



    public Node MergeLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        Node resultNode = new Node(0);
       // resultNode.value = 0;
       // resultNode.next = null;

        if(headA == null){
            return headB;
        }
        if(headB == null){
            return headA;
        }

        while(headA != null && headB != null){
            if(headA.value <= headB.value){
                resultNode.next = headA;
                resultNode = headA;
                resultNode.next = headB;
                resultNode = headB;
            } else {
                resultNode.next = headB;
                resultNode = headB;
                resultNode.next = headA;
                resultNode = headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        if(headA != null){
            resultNode.next = headA;
            resultNode = headA;
        }
        if(headB != null){
            resultNode.next = headB;
            resultNode = headB;
        }

        return resultNode.next;
    }




}
