package BinarySearch.BinarySearchFindAllLeafs;

public class findAllLeafNodesInTree {
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
        bs.findLeafNodes(bs.root);

    }
}

class BinarySearch {
    public Node root;

    public void findLeafNodes(Node root){
        if(root != null){
            findLeafNodes(root.left);
            findLeafNodes(root.right);
            if(root.left == null && root.right == null){
                System.out.println("Leaf Node: " + root.value);
            }
        }
    }

    public Node get(int value){
        Node node = root;
        while(node.value != value){
            if(node.value < value){
                node = node.left;
            } else if (node.value > value){
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
                    if(node == null){
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


class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value){
        this.left = null;
        this.right = null;
        this.value = value;
    }
}
