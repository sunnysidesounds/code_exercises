package BinarySearchTree.BinarySearchExercise;


public class Node {
    public Node left;
    public Node right;
    public int value;

    public Node(){
        this.left = null;
        this.right = null;
        this.value = 0;
    }

    public Node(int value){
        this.left = null;
        this.right = null;
        this.value = value;
    }

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }

    public int getValue(){
        return value;
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public void setRight(Node right){
        this.right = right;
    }

    public void setValue(int value){
        this.value = value;
    }
}
