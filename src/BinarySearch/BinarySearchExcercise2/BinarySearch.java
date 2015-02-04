package BinarySearch.BinarySearchExcercise2;

import java.util.*;

/*
Breadth-First Traversal
    - Level Order Traversal


Depth-First Traversal
    - Pre-Order Traversal <root><left><right>
    - In-Order Traversal <left><root><right>
    - Post-Order Traveral <left><right><root>


 */



public class BinarySearch {

    public static void main(String[] args){
        BinarySearchTree bs = new BinarySearchTree();
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
        System.out.println("Breadth-First Traversal (Level Order): " + bs.breadthFirstSearch(bs.root));
        System.out.println();

        bs.preOrder(bs.root);
        System.out.println("Depth-First Traversal (Pre-Order): " + bs.preOrderArray);
        System.out.println("Depth-First Traversal 2 (Pre-Order): " + bs.preOrderTraversal(bs.root));
        System.out.println();

        bs.inOrder(bs.root);
        System.out.println("Depth-First Traversal (In-Order): " + bs.inOrderArray);
        System.out.println("Depth-First Traversal 2 (In-Order): " + bs.inOrderTraversal(bs.root));
        System.out.println();

        bs.postOrder(bs.root);
        System.out.println("Depth-First Traversal (Post-Order): " + bs.postOrderArray);
        System.out.println("Depth-First Traversal 2 (Post-Order): " + bs.postorderTraversal(bs.root));
        System.out.println();


        System.out.println("Find Min Node: " + bs.findMinNode(bs.root));
        System.out.println("Find Max Node: " + bs.findMaxNode(bs.root));
        System.out.println("Find height of edges: " + bs.findHeightEdges(bs.root));
        System.out.println("Find height of nodes: " + bs.findHeightNodes(bs.root));
        System.out.println();

        int sum = 48;
        System.out.println("Found sum of " + sum + " in tree: " + bs.hasPathSum(bs.root, sum));

    }



}

class BinarySearchTree{
    Node root;
    ArrayList<Integer> preOrderArray = new ArrayList<Integer>();
    ArrayList<Integer> inOrderArray = new ArrayList<Integer>();
    ArrayList<Integer> postOrderArray = new ArrayList<Integer>();



    public boolean hasPathSum(Node root, int sum) {
        if(root == null){
            return false;
        }
        Queue<Node> queue = new LinkedList<Node>();
        Queue<Integer> values = new LinkedList<Integer>();

        queue.add(root);
        values.add(root.value);

        while(!queue.isEmpty()){
            Node node = queue.poll();
            int sumValue = values.poll();
            if(node.left == null && node.right == null && sumValue == sum){
                return true;
            }
            if(node.left != null){
                queue.add(node.left);
                values.add(sumValue + node.left.value);
            }
            if(node.right != null){
                queue.add(node.right);
                values.add(sumValue + node.right.value);
            }
        }
        return false;
    }



    public int findHeightEdges(Node root){
        if(root == null){
            return -1;
        }
        return Math.max(findHeightEdges(root.left), findHeightEdges(root.right)) + 1;
    }

    public int findHeightNodes(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(findHeightNodes(root.left), findHeightNodes(root.right)) + 1;
    }

    public int findMaxNode(Node root){
        if(root == null){
            return -1;
        }
        while(root.right != null){
            root = root.right;
        }
        return root.value;
    }

    public int findMinNode(Node root){
        if(root == null){
            return -1;
        }
        while(root.left != null){
            root = root.left;
        }
        return root.value;
    }


    /* POST-ORDER */
    public void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            postOrderArray.add(root.value);
        }
    }


    public List<Integer> postorderTraversal(Node root) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        if(root == null){
            return output;
        }
        stack.push(root);
        Node previous = null;
        while(!stack.isEmpty()){
            Node node = stack.peek();
            if(previous == null || previous.left == node || previous.right == node){
                if(node.left != null){
                    stack.push(node.left);
                } else if (node.right != null){
                    stack.push(node.right);
                } else {
                    stack.pop();
                    output.add(node.value);
                }
            } else if(node.left == previous){
                if(node.right != null){
                    stack.push(node.right);
                } else {
                    stack.pop();
                    output.add(node.value);
                }

            } else if (node.right == previous){
                stack.pop();
                output.add(node.value);
            }
            previous = node;
        }
        return output;
    }



    /* PRE-ORDER */
    public void preOrder(Node root){
        if(root != null){
            preOrderArray.add(root.value);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public List<Integer> preOrderTraversal(Node root){
        ArrayList<Integer> output = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        if(root == null){
            return output;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            output.add(node.value);
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
        return output;
    }


    /* IN-ORDER */
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            inOrderArray.add(root.value);
            inOrder(root.right);
        }
    }

    public List<Integer> inOrderTraversal(Node root){
        ArrayList<Integer> output = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
        if(root == null){
            return output;
        }
        Node node = root;
        while(!stack.isEmpty() || node != null){
            if(node != null){
                stack.push(node);
                node = node.left;
            } else {
                Node newNode = stack.pop();
                output.add(newNode.value);
                node = newNode.right;
            }
        }
        return output;
    }


    public List<List<Integer>> breadthFirstSearch(Node root){
        List<List<Integer>> outputArray = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<Node>();
        int level = 0;

        if(root == null){
            return outputArray;
        }

        queue.add(root);
        while(!queue.isEmpty()){
            level = queue.size();
            ArrayList<Integer> levelsArray = new ArrayList<Integer>();
            while(level > 0){
                Node node = queue.remove();
                levelsArray.add(node.value);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add((node.right));
                }
                level--;
            }
            outputArray.add(levelsArray);
        }
        return outputArray;
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
    public Node left;
    public Node right;
    public int value;

    public Node(int value){
        this.left = null;
        this.right = null;
        this.value = value;
    }
}


