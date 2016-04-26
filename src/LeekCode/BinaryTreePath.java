package LeekCode;
import java.util.*;

public class BinaryTreePath {


    /*
    Given a binary tree, return all root-to-leaf paths.

    For example, given the following binary tree:

       1
     /   \
    2     3
     \
      5

    All root-to-leaf paths are:

    ["1->2->5", "1->3"]
     */


    public static void main(String[] args){
        BinaryTreePath bs = new BinaryTreePath();
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


        System.out.println("Count " + bs.count(bs.root));




    }

    public TNode root;



    public List<String> binaryTreePaths(TNode root) {
        ArrayList<String> theList = new ArrayList<String>();
        binaryTreePathRecur(root, "", theList);
        return theList;
    }

    public List<String> binaryTreePathRecur(TNode node, String path, ArrayList<String> aList){

        if(node != null){

            path = path + node.val;

            if(node.left == null && node.right == null){
                aList.add(path);
            }

            path = path + "->";

            if(node.left != null){
                binaryTreePathRecur(node.left, path, aList);
            }

            if(node.right != null){
                binaryTreePathRecur(node.right, path, aList);
            }

        }
        return aList;
    }


    public void add(int value){
        TNode newNode = new TNode(value);
        if(root == null){
            root = newNode;
        } else {
            TNode focusNode = root;
            TNode parentNode;
            while(true){
                parentNode = focusNode;
                if(value <= focusNode.val){
                    focusNode = focusNode.left;
                    if(focusNode == null){
                        parentNode.left = newNode;
                        return;
                    }
                } else if(value > focusNode.val) {
                    focusNode = focusNode.right;
                    if(focusNode == null){
                        parentNode.right = newNode;
                        return;
                    }

                }
            }
        }
    }


    public int count(TNode rootNode){
        if(rootNode != null){
            int count = 1;
            count += count(rootNode.left);
            count += count(rootNode.right);
            return count;
        } else {
            return 0;
        }
    }








}

class TNode {
    public TNode left;
    public TNode right;
    public int val;
    public TNode(int value){
        this.left = null;
        this.right = null;
        this.val = value;
    }
}






