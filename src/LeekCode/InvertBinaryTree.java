package LeekCode;

public class InvertBinaryTree {

    /*

    Invert a binary tree.

         4
       /   \
      2     7
     / \   / \
    1   3 6   9

    to

         4
       /   \
      7     2
     / \   / \
    9   6 3   1

     */



    public static void main(String[] args){





    }

    public TreeNode invertTree(TreeNode root) {
        if(root != null){
            invert(root);
        }

        return root;


    }


    public void invert(TreeNode node){

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        if(node.left != null){
            invert(node.left);
        }

        if(node.right != null){
            invert(node.right);
        }



    }



}



class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }
}
