package BinarySearch.BinarySearchLevelOrderTreeBottomTop;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class BinarySearchTreeLevelOrderBottomTop {
    public static void main(String[] args){
        BinarySearchTree bs = new BinarySearchTree();
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

        System.out.println("Count " + bs.count(bs.root));

        System.out.println(bs.bfsBottomTop());




    }

}


class BinarySearchTree{
    public Node root;

    public List<List<Integer>> bfsBottomTop(){
        ArrayList<List<Integer>> output = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<Node>();
        Stack<List<Integer>> stack = new Stack<List<Integer>>();
        int level = 0;
        if(root == null){
            return output;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            level = queue.size();
            ArrayList<Integer> sub = new ArrayList<Integer>();
            while(level > 0){
                Node node = queue.remove();
                sub.add(node.value);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                level--;
            }

            stack.push(sub);
        }
        while(!stack.isEmpty()){
            output.add(stack.pop());

        }


        return output;
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
        if(node.value < value){
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
                if(node.value < value){
                    node = node.left;
                    if(node == null){
                        parent.left = newNode;
                        return;
                    }
                } else if (node.value > value){
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
    Node left;
    Node right;
    int value;

    public Node(int value){
        this.left = null;
        this.right = null;
        this.value = value;
    }
}
