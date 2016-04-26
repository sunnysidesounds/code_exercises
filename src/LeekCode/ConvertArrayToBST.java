package LeekCode;

public class ConvertArrayToBST {

    //Given an array where elements are sorted in ascending order, convert it to a height balanced BST.


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

    public ZNode root;


    public static ZNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTRecur(nums, 0, nums.length);
    }


    public static ZNode sortedArrayToBSTRecur(int[] arr, int start, int end){
        if(start > end){
            return null;
        }

        int middle = (start + end) / 2;
        ZNode node = new ZNode(arr[middle]);

        node.left = sortedArrayToBSTRecur(arr, start, middle-1);
        node.right = sortedArrayToBSTRecur(arr, middle+1, end);

        return node;
    }



    public void add(int value){
        ZNode newNode = new ZNode(value);

        if(root == null){
            root = newNode;
        } else {
            ZNode focusNode = root;
            ZNode node;
            while(true){
                node = focusNode;
                if(value <= focusNode.val){
                    focusNode = focusNode.left;
                    if(focusNode == null){
                        node.left = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.right;
                    if(focusNode == null){
                        node.right = newNode;
                        return;
                    }
                }
            }

        }
    }


    public int count(ZNode root){
        if(root == null){
            return 0;
        } else {
            int c = 1;
            c += count(root.left);
            c += count(root.right);
            return c;
        }





    }













}






class ZNode {
    public ZNode left;
    public ZNode right;
    public int val;
    public ZNode(int value){
        this.left = null;
        this.right = null;
        this.val = value;
    }
}
