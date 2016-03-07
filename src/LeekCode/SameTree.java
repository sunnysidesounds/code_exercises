package LeekCode;

public class SameTree {
/*

 Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if
they are structurally identical and the nodes have the same value

 */

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */


    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean isLeftEqual = false;
        boolean isRightEqual = false;

        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }


        if(p.left != null && q.left != null){
            if(p.left.val == q.left.val){
                isLeftEqual = isSameTree(p.left, q.left);
            }
        }

        if(p.right != null && q.right != null){
            if(p.right.val == q.right.val){
                isRightEqual = isSameTree(p.right, q.right);
            }
        }


        return isLeftEqual && isRightEqual;
    }



}


