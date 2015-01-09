package BinarySearch.BinarySearchExercise;


public class BinarySearchRun {

    public static void main(String[] args){
        BinarySearch bst = new BinarySearch();

        bst.insert(50);
        bst.insert(52);
        bst.insert(49);
        bst.insert(40);
        bst.insert(60);
        bst.insert(45);


        System.out.println("In Order: ");
        bst.inOrderTraversal();
        System.out.println("");
        System.out.println("Pre Order: ");
        bst.preOrderTraversal();
        System.out.println("");
        System.out.println("Post Order: ");
        bst.postOrderTraversal();



    }


}
