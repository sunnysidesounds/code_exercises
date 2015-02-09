package BinarySearch.BinarySearchExcercise3;

import java.util.*;

public class BinarySearchTree {

    public static void main(String[] args){
        BinarySearch bs = new BinarySearch();
        bs.add(15);
        bs.add(10);
        bs.add(20);
        bs.add(8);
        bs.add(12);
        bs.add(16);
        bs.add(25);
        bs.add(9);
        bs.add(4);
        bs.add(11);
        bs.add(13);
        bs.add(14);
        bs.add(17);
        bs.add(28);




        System.out.println("Number of nodes is: " + bs.countNodes(bs.root));

        //bs.delete(bs.root, 25);

        System.out.println("Level Order" + bs.bfs(bs.root));


        System.out.println("Number of nodes after delete is: " + bs.countNodes(bs.root));



    }
}


class BinarySearch{
    public Node root;

    public List<List<Integer>> bfs(Node root){
        ArrayList<List<Integer>> parent = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<Node>();
        int level = 0;
        if(root == null){
            return parent;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            level = queue.size();
            ArrayList<Integer> child = new ArrayList<Integer>();
                while(level > 0){
                    Node current = queue.remove();
                    child.add(current.value);
                    if(current.left != null){
                        queue.add(current.left);
                    }
                    if(current.right != null){
                        queue.add(current.right);
                    }
                    level--;
                }
            parent.add(child);
        }
        return parent;
    }


    public int countNodes(Node root){
        if(root == null){
            return 0;
        } else {
            int count = 1;
            count += countNodes(root.left);
            count += countNodes(root.right);
            return count;
        }
    }

    public Node delete(Node root, int value){
        Node node1;
        if(root == null){
            return null;
        }
        if(value == root.value){
            Node leftNode = root.left;
            Node rightNode = root.right;
            // 1: Node child nodes
            if(leftNode == null && rightNode == null){
                return null;
            // 2: One child
            } else if(leftNode == null){
                return rightNode;
            // 2: One child
            } else if(rightNode == null){
                return leftNode;
            // 3: Two or more children
            } else {
                Node p1 = rightNode;
                Node p2 = rightNode;
                while(p1.left != null){
                    p1 = p1.left;
                }
                p1.left = leftNode;
                return p2;
            }
        }
        if(value < root.value){
            node1 = delete(root.left, value);
            root.left = node1;
        } else if(value > root.value) {
            node1 = delete(root.right, value);
            root.right = node1;
        }
        return root;

    }

    public Node get(int value){
        Node node = root;
        if(value < node.value){
            node = node.left;
        } else {
            node = node.right;
        }
        return node;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
        } else {
            Node node = root;
            Node parent;
            while(true){
                parent = node;
                if(value < node.value){
                    node = node.left;
                    if(node == null){
                        parent.left = newNode;
                        return;
                    }
                } else if(value > node.value){
                    node = node.right;
                    if(node == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

}

class Node {
    public Node left;
    public Node right;
    public int value;
    public Node(int value){
        this.left = null;
        this.right = null;
        this.value = value;
    }
}
