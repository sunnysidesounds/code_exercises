package HackerRank;

import java.io.StringReader;
import java.util.Scanner;

public class MThToLastElement {

	public static void main(String[] args){
		Scanner in = new Scanner(new StringReader(
				"4\n" + "10 200 3 40000 5\n"
		));
		int M = in.nextInt();
		 // Loop over this
		CustomLinkedList list = new CustomLinkedList();
		while(in.hasNext()){
			list.add(in.nextInt());
		}

		if(M >= list.length) {
			System.out.println("NIL");
		} else {

			int index = Math.abs(list.length - M);
			Node current = list.head;
			while(index-->0){
				current = current.next;
			}
			System.out.println(current.next.value);


		}



		// m = 4, list.length = 10


	}
}


class CustomLinkedList{
	public Node head;
	public int length;
	public CustomLinkedList(){
		head = new Node(0);
	}

	public void add(int val){
		Node newValue = new Node(val);
		if(this.head == null){
			this.head = newValue;
		}
		Node current = this.head;
		while(current.next != null){
			current = current. next;
		}
		current.next = newValue;
		length++;
	}
}



class Node {
	public int value;
	public Node next;
	public Node(int val){
		this.value = val;
	}
}
