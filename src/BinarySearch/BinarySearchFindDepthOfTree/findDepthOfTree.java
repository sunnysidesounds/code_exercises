package BinarySearch.BinarySearchFindDepthOfTree;

import java.util.*;

public class findDepthOfTree {
      public static void main(String[] args){
          BinarySearch bs = new BinarySearch();
          bs.add(100);
          bs.add(50);
          bs.add(45);
          bs.add(42);
          bs.add(46);
          bs.add(55);
          bs.add(52);
          bs.add(57);
          bs.add(150);
          bs.add(145);
          bs.add(142);
          bs.add(146);
          bs.add(155);
          bs.add(152);
          bs.add(157);
          bs.add(160);
        //  bs.add(165);

          System.out.println("Count is: " + bs.count(bs.root));
          System.out.println("Max Depth of Tree is: " + bs.findMaxDepth(bs.root));
          System.out.println("Min Depth of Tree is: " + bs.findMinDepth(bs.root));

          System.out.println("Is Balanced Tree: " + bs.isBalancedTree(bs.root));

          System.out.println("Height: " + bs.height(bs.root));

      }
}


class BinarySearch{
    public Node root;

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

    public boolean isBalancedTree(Node root){
        if(root == null){
            return false;
        }

        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(left-right) > 2){
            return false;
        } else {
            return true;
        }
    }

    public int maxDepth(Node root){
        if(root == null){
            return 0;
        }
        return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int minDepth(Node root){
        if(root == null){
            return 0;
        }
        return 1+ Math.min(minDepth(root.left), minDepth(root.right));
    }

    public int height(Node root){
        if(root == null){
            return 0;
        } else {
            int left = height(root.left);
            int right = height(root.right);

            if(left == -1 || right == -1){
                return -1;
            }
            if(Math.abs(left-right)> 1){
                return -1;
            }
            return Math.max(left, right) + 1;

        }
    }

    public int findMaxDepth(Node root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(findMaxDepth(root.left), findMaxDepth(root.right));
    }

    public int findMinDepth(Node root){
        if(root == null){
            return 0;
        }
        LinkedList<Node> myList = new LinkedList<Node>();
        LinkedList<Integer> myCount = new LinkedList<Integer>();

        myList.add(root);
        myCount.add(1);

        while(!myList.isEmpty()){
            Node node = myList.remove();
            Integer count = myCount.remove();
            if(node.left != null){
                myList.add(node.left);
                myCount.add(count + 1);
            }
            if(node.right != null){
                myList.add(node.left);
                myCount.add(count + 1);
            }
            if(node.left == null && node.right == null){
                return count;
            }
        }

        return 0;
    }

    public Node get(int value){
        Node node = root;
        while(node.value != value){
            if(node.value < value){
                node = node.left;
            } else if (node.value > value){
                node = node.right;
            } else {
                break;
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
