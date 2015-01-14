package BinarySearch.BinarySearchFindDepth;

public class BinarySearchTree {
    public Node root;


    public void insert(int value){
        root = insert(root, value);
    }

    private Node insert(Node node, int value){
        if(node == null){
            System.out.println("Inserting root: " + value);
            node = new Node(value);
        } else {
            if(value <= node.value){
                System.out.println("Inserting left: " + value);
                node.left = insert(node.left, value);
            } else {
                System.out.println("Inserting right: " + value);
                node.right = insert(node.right, value);
            }
        }
         return node;
    }

    public boolean get(int value){
         return get(root, value);
    }

    private boolean get(Node node, int value){
        boolean f = false;
        while(node != null && !f){
            if(value <= node.value){
                f = get(node.left, value);
            } else if(value > node.value){
                f = get(node.right, value);
            } else {
                f = true;
                break;
            }
            f = get(node, value);
        }
        return f;
    }



}
