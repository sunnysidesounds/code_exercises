package LeekCode;

public class SwapNodesInPairs {


    /*

    Given a linked list, swap every two adjacent nodes and return its head.

    For example,
    Given 1->2->3->4, you should return the list as 2->1->4->3.



    Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

     */


    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);


        System.out.println("List: " + node.toString());
        System.out.println("List Reverse: " + swapPairs(node).toString());


    }


    public ListNode head;


    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }


        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode previous = newHead;
        ListNode current = newHead.next;
        while(previous.next != null && previous.next.next != null){
            ListNode temp1 = previous;
            previous = previous.next;
            temp1.next = previous.next;

            ListNode temp2 = previous.next.next;
            previous.next.next = previous;
            previous.next = temp2;

        }


        return newHead.next;

    }



    public static ListNode reverseList(ListNode node) {
        if(node == null || node.next == null){
            return node;
        }
        ListNode previous = null;
        ListNode current = node;
        while(current != null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;





    }






    public void add(int value){
        ListNode node = new ListNode(value);
        if(head == null){
            head = node;
            node.next = head;
        } else {
            ListNode current = head;
            while(current.next != head){
                current = current.next;
            }
            current.next = node;
            node.next = head;
        }


    }


















}




class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x){val = x;}

    @Override
    public String toString(){
        String data = "";
        ListNode current = this;
        do {
            data += "[" + current.val + "]";
            current = current.next;
        } while (current != null);
        return data;
    }
}
