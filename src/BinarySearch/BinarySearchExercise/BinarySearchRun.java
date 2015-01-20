package BinarySearch.BinarySearchExercise;


public class BinarySearchRun {

    public static void main(String[] args){
        BinarySearch bst = new BinarySearch();

        bst.insert(40);
        bst.insert(20);
        bst.insert(60);
        bst.insert(10);
        bst.insert(30);
        bst.insert(50);
        bst.insert(70);
        bst.insert(2);
        bst.insert(5);
        bst.insert(65);
        bst.insert(80);


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
