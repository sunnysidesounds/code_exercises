package BinarySearch;

public class findNthHighestValue {

    public static void main(String[] args){

        BinarySearch bs = new BinarySearch();
        bs.add(50);
        bs.add(40);
        bs.add(60);
        bs.add(35);
        bs.add(45);
        bs.add(55);
        bs.add(65);



        System.out.println("Count is: " + bs.count(bs.root));
        System.out.println("Get nth hightest value: ");
        bs.findNthHighest(bs.root, bs.count(bs.root)-1);


    }




}




class BinarySearch{
    Node root;
    int counter = 1;

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

    public void findNthHighest(Node root, int n){
        if(root == null){
            return;
        }
        counter++;
        findNthHighest(root.right, n);
        if(++counter == n){
            System.out.println(root.value);
        }
        findNthHighest(root.left, n);
    }

    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.value);
            inOrder(root.right);
        }
    }

    public void preOrder(Node root){
        if(root != null){
            System.out.println(root.value);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.value);
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
            Node focusNode = root;
            Node parent;
            while(true){
                parent = focusNode;
                if(value < focusNode.value){
                    focusNode = focusNode.left;
                    if(focusNode == null){
                        parent.left = newNode;
                        return;
                    }
                } else if(value > focusNode.value){
                    focusNode = focusNode.right;
                    if(focusNode == null){
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





