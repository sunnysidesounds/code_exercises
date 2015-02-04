package CompanyInterviewsQuestions.Zillow;

import java.util.NoSuchElementException;

public class TrinaryTree {
    private Node root;

    public Node getRoot(){
        return root;
    }


    public int countNodes(Node root){
        if(root == null){
            return 0;
        } else {
            int count = 1;
            count += countNodes(root.getLeft());
            count += countNodes(root.getMiddle());
            count += countNodes(root.getRight());
            return count;
        }
    }


    /**
     * This insert a int value into a Trinary Tree
     * @param value The int value to insert
     */
    public void insert(int value){
        root = insert(root, value);
    }

    /**
     * Private method to insert a int value into a Trinary Tree
     * @param node The root node of the subtree
     * @param value The int value to insert
     * @return The root of the tree
     */
    private Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
        } else {
            if(value < node.getValue()){
                node.setLeft(insert(node.getLeft(), value));
            } else if(value > node.getValue()){
                node.setRight(insert(node.getRight(), value));
            } else {
                node.setMiddle(insert(node.getMiddle(), value));
            }
        }
        return node;
    }

    /**
     * This deletes a int value from a Trinary Tree
     * @param value The int value to delete
     */
    public void delete(int value){
        root = delete(root, value);
        System.out.println("Delete node value: " + root.getValue());
    }

    /**
     * Private method to delete a int value from a Trinary Tree
     * @param node The root node of the subtree
     * @param value The int value to delete
     * @throws NoSuchElementException if int value is not in the Trinary Tree or if Trinary Tree is empty.
     * @return Returns the deleted root node.
     */
    private Node delete(Node node, int value){
        if(node == null){
            throw new NoSuchElementException();
        } else if(value < node.getValue()){
            node.setLeft(delete(node.getLeft(), value));
        } else if(value > node.getValue()){
            node.setRight(delete(node.getRight(), value));
        } else if(value == node.getValue()) {
            if(node.getMiddle() != null){
                node.setMiddle(node.getMiddle().getMiddle());
            } else if (node.getRight() != null){
                node.setValue(getSuccessor(node.getRight()).getValue());
                node.setRight(delete(node.getRight(), node.getValue()));
            } else {
                node = node.getLeft();
            }
        }
        return node;
    }

    private Node getSuccessor(Node node){
        if(node.getLeft() == null){
            return node;
        } else {
            return getSuccessor(node.getLeft());
        }
    }
}


class Node {
    private int value;
    private Node left;
    private Node middle;
    private Node right;

    public Node(int value){
        this.value = value;
        this.left = null;
        this.middle = null;
        this.right = null;
    }

    public Node getLeft(){
        return left;
    }

    public Node getMiddle(){
        return middle;
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

    public void setMiddle(Node middle){
        this.middle = middle;
    }

    public void setRight(Node right){
        this.right = right;
    }

    public void setValue(int value){
        this.value = value;
    }

}
