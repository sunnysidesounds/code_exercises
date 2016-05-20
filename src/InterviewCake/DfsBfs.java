package InterviewCake;

import java.util.*;

public class DfsBfs {


    public static void main(String[] args){
        DfsBfs bs = new DfsBfs();
        bs.add(1);
        bs.add(2);
        //bs.add(20);
        //bs.add(8);
        //bs.add(12);
        //bs.add(16);
        //bs.add(25);
        //bs.add(9);
        //bs.add(4);
        //bs.add(11);
        //bs.add(13);
        ////bs.add(14);
        //bs.add(17);
        //bs.add(28);

        System.out.println("dfs");
        bs.dfs(bs.root);
        System.out.println("");
        System.out.println("bfs");
        bs.bfs(bs.root);
        System.out.println("");
        System.out.println("bfsZigZag");
        System.out.println(bs.bfsZigZag(bs.root));



    }


    public Node root;

    public void dfs(Node root){
        Stack<Node> stack = new Stack<Node>();
        if(root == null){
            return;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
            System.out.print(node.value + " ");
        }
    }



    public void bfs(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        if(root == null){
            return;
        }
        queue.clear();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            System.out.print(node.value + " ");
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
    }


    public List<List<Integer>> bfsZigZag(Node root){
        List<List<Integer>> parent = new ArrayList<List<Integer>>();

        if(root == null){
            return parent;
        }

        Stack<Node> stack = new Stack<Node>();

        boolean zigzag = false;
        stack.push(root);

        while(!stack.isEmpty()){
            ArrayList<Integer> child = new ArrayList<Integer>();
            Stack<Node> temp = new Stack<Node>();
            while(!stack.isEmpty()){
                Node node = stack.pop();
                child.add(node.value);

                if(!zigzag){
                    if(node.left != null){
                        temp.push(node.left);
                    }
                    if(node.right != null){
                        temp.push(node.right);
                    }
                } else {
                    if(node.right != null){
                        temp.push(node.right);
                    }
                    if(node.left != null){
                        temp.push(node.left);
                    }
                }
            }
            zigzag = !zigzag;
            parent.add(child);


        }

        return parent;


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
