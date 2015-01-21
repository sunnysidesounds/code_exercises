package BinarySearch.BinarySearchPrintLevelOrderTree;

import java.util.LinkedList;
import java.util.Queue;

public class printBinaryTreeLevelOrder {
    public static void main(String[] args){
        BinarySearch bs = new BinarySearch();
        bs.add(50);
        bs.add(45);
        bs.add(55);
        bs.add(42);
        bs.add(46);
        bs.add(52);
        bs.add(56);
        bs.add(35);
        bs.add(43);
        bs.add(51);
        bs.add(53);

        System.out.println("Tree count is: " + bs.count(bs.root));

        bs.BFS(bs.root);


    }
}


class BinarySearch{
    public Node root;

    public void BFS(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        if(root == null){
            return;
        }
        queue.clear();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            System.out.println(node.value + " ");
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
    }


    public int count(Node root){
        if(root == null){
            return 0;
        } else {
            int count = 1;
            count += count(root.left);
            count += count(root.right);
            return count;
        }
    }



    public Node get(int value){
        Node node = root;
        while(node.value != value){
            if(value < node.value){
                node = node.left;
            } else if(value > node.value){
                node = node.right;
            }
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
                    if(node == null) {
                        parent.left = newNode;
                        return;
                    }
                } else if (value > node.value){
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


class Node{
    public int value;
    public Node left;
    public Node right;

    public Node(int value){
        this.left = null;
        this.right = null;
        this.value = value;
    }
}
