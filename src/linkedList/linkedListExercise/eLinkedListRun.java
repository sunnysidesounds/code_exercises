package LinkedList.LinkedListExercise;


public class eLinkedListRun {

    public static void main(String[] args){
        eLinkedList list = new eLinkedList();
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("7");
        list.add("9");
        list.add("11");

        // Add a node a index 2
        list.add("2", 2);

        System.out.println("LinkedList created: " + list);
        System.out.println("Get node with index 4: " + list.get(4));
        System.out.println("Removing node with index 2: " + list.remove(2));
        System.out.println("LinkedList after node removal: " + list);
        System.out.println("Getting LinkedList head: " + list.getHead());
        System.out.println("Getting LinkedList middle: " + list.getMiddle());
        System.out.println("Getting LinkedList tail: " + list.getTail());
    }

}
