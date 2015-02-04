package LinkedLists.LinkedListTwoIntersection;

/*
Write a program to find the node at which the intersection of two singly linked lists begins.
For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗
B:     b1 → b2 → b3

begin to intersect at node c1.

Notes:

    If the two linked lists have no intersection at all, return null.
    The linked lists must retain their original structure after the function returns.
    You may assume there are no cycles anywhere in the entire linked structure.
    Your code should preferably run in O(n) time and use only O(1) memory.

 Method 3(Using difference of node counts)
1) Get count of the nodes in first list, let count be c1.
2) Get count of the nodes in second list, let count be c2.
3) Get the difference of counts d = abs(c1 – c2)
4) Now traverse the bigger list from the first node till d nodes so that from here onwards both the lists have equal no of nodes.
5) Then we can traverse both the lists in parallel till we come across a common node. (Note that getting a common node is done by comparing the address of the nodes)


 */

public class IntersectionOfLinkedList{
    public static void main(String[] args){
        LinkedLists list1 = new LinkedLists();
        list1.insert(1);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);
        list1.insert(6);
        list1.insert(7);

        LinkedLists list2 = new LinkedLists();
        list2.insert(2);
        list2.insert(4);
        list2.insert(5);
        list2.insert(6);
        list2.insert(7);


        System.out.println("List1: " + list1.toString() + " count is: " + list1.length(list1.head));
        System.out.println("List2: " + list2.toString() + " count is: " + list1.length(list2.head));

        Node intersectionValue = list1.getIntersectionNode2(list1.head, list2.head);

    }




}




class LinkedLists {
    public Node head;
    public int counter;

    public LinkedLists() {
        head = new Node(null);
    }

    public Node getIntersectionNode2(Node headA, Node headB){
        if(headA == null || headB == null){
            return null;
        }

        int lenA = length(headA);
        int lenB = length(headB);
        int difference = Math.abs(lenA - lenB);

        if(lenA > lenB){
            for(int i =0; i < difference; i++){
                headA = headA.next;
            }
        } else if(lenA < lenB){
            for(int i =0; i < difference; i++){
                headB = headB.next;
            }
        }

        while(headA != null && headB != null){
            if(headA.value == headB.value){
                System.out.println("We have an intersection: " + headA.value);
                return headA;
            }
            headA = headA.next;
            headB = headB.next;


        }

        return null;


    }




    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null){
            return null;
        }
        int lengthA = length(headA);
        int lengthB = length(headB);
        if(lengthA > lengthB){
            while(lengthA > lengthB){
                headA = headA.next;
                lengthA--;
            }

        } else {
            while(lengthA < lengthB){
                headB = headB.next;
                lengthB--;
            }

        }
        while(headA != null){
            if(headA.value == headB.value){
                System.out.println(headA.value);
                return headA;
            }
            headA = headA.next;
            headB = headB.next;

        }
        return null;
    }

    public int length(Node node){
        int count = 0;
        while(node.next != null){
            count++;
            node = node.next;
        }
      return count;
    }


    public Object get(int value){
        if(head == null){
            return null;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
            if(value == current.value){
                break;
            }
            if(current.next == null){
                return null;
            }

        }
        return current;
    }

    public void insert(int value){
        Node newNode = new Node(value);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        counter++;
    }

    public void delete(int value){
        if(head == null){
            return;
        }
        Node current = head;
        Node previous = null;
        while(current.next != null && value != current.value){
            previous = current;
            current = current.next;
        }
        if(previous == null){
            head = head.next;
            return;
        }
        if(current.next == null){
            previous.next = null;
            return;
        }

        previous.next = current.next;
        counter--;
    }

    public String toString(){
        Node current = head.next;
        String o = "";
        while(current != null){
            o += "[" + current.value.toString() + "]";
            current = current.next;
        }
        return o;
    }

}

class Node{
    public Object value;
    public Node next;

    public Node(Object value){
        this.value = value;
    }

}
