package BinarySearchTree.BinarySearchExercise;


public class BinarySearch {

    private Node root;

    public boolean isEmpty(){
        return this.root == null;
    }

    public void insert(int value){
        root = insert(root, value);
    }

    private Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
        } else {
            if(value <= node.getValue()){
                node.left = insert(node.left, value);
            } else {
                node.right = insert(node.right, value);
            }
        }
        return node;
    }

    public boolean get(int value){
        return get(root, value);
    }

    private boolean get(Node node, int value){
        boolean foundNode = false;
        while(node != null && !foundNode){
            int nodeValue = node.getValue();
            if(value < nodeValue){
                node = node.getLeft();
            } else if (value > nodeValue){
                node = node.getRight();
            } else {
                foundNode = true;
                break;
            }
            foundNode = get(node, value);

        }
        return foundNode;
    }

    public void delete(int value){
        if(isEmpty()){
            System.out.println("Tree is empty");
        } else if(!get(value)){
            root = delete(root, value);
            System.out.println(value + " has been deleted!");
        }
    }

    private Node delete(Node root, int value){
        Node p;
        Node p2;
        Node n;
        if(root.getValue() == value){
            Node leftNode;
            Node rightNode;
            leftNode = root.getLeft();
            rightNode = root.getRight();
            if(leftNode == null && rightNode == null){
                return null;
            } else if(leftNode == null){
                p = rightNode;
                return p;
            } else if(rightNode == null){
                p = leftNode;
                return p;
            } else {
                p2 = rightNode;
                p = rightNode;
                while(p.getLeft() != null){
                    p = p.getLeft();
                }
                p.setLeft(leftNode);
                return p2;
            }
        }
        if(value < root.getValue()){
            n = delete(root.getLeft(), value);
            root.setLeft(n);
        } else {
            n = delete(root.getRight(), value);
            root.setRight(n);
        }
        return root;
    }

    public int countNodes(){
        return countNodes(root);
    }

    private int countNodes(Node root){
        if(root == null){
            return 0;
        } else {
            int count = 1;
            count += countNodes(root.getLeft());
            count += countNodes(root.getRight());
            return count;
        }
    }

    public void inOrderTraversal(){
        inOrderTraveral(root);
    }

    private void inOrderTraveral(Node root){
        if(root != null){
            inOrderTraveral(root.getLeft());
            System.out.println(root.getValue() + " ");
            inOrderTraveral(root.getRight());
        }
    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node root){
        if(root != null){
            System.out.println(root.getValue() + " ");
            preOrderTraversal(root.getLeft());
            preOrderTraversal(root.getRight());

        }
    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node root){
        if(root != null){
            postOrderTraversal(root.getLeft());
            postOrderTraversal(root.getRight());
            System.out.println(root.getValue() + " ");
        }
    }
}
