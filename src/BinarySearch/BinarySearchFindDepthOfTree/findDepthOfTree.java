package BinarySearch.BinarySearchFindDepthOfTree;

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
          bs.add(165);

          System.out.println("Count is: " + bs.count(bs.root));
          System.out.println("Max Depth of Tree is: " + bs.findDepth(bs.root));

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

    public int findDepth(Node root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(findDepth(root.left), findDepth(root.right));
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
