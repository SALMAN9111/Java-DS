package com.datastructure.singlylinkedlist;

public class singlyLinkedLIstTest {

	public static void main(String[] args) throws IllegalAccessException {
		singlyLinkedLIstTest sll = new singlyLinkedLIstTest();
		sll.head = new listNode(10);
		listNode second = new listNode(20);
		listNode third = new listNode(30);

		sll.head.next = second;
		second.next = third;

		System.out.println("Displaying SinglyLinkedList");
		sll.display(sll.head);
//
//		System.out.println("\nDisplaying Length");
//		System.out.println("Length is : " + sll.Length());
//
//		System.out.println("\nInserting a newNode at the first position of the SinglyLinkedList");
//		sll.insertAtFirst(1);
//		sll.display(sll.head);

//		System.out.println("\nInserting a newNode at the end of the SinglyLinkedList");
//		sll.insertAtEnd(40);
//		sll.display(sll.head);
//		
//		System.out.println("\nInserting a newNode at a given position in SinglyLinkedList");
//		sll.insertInBetween(25, 4);
//		sll.display(sll.head);

//		System.out.println("\nInserting a newNode at a given position in SinglyLinkedList");
//		sll.insertInBetween(15, 3);
//		sll.display();
//		
//		System.out.println("\nInserting a newNode at a given position in SinglyLinkedList");
//		sll.insertInBetween(100, 9823);
//		sll.display();

//		System.out.println("\nDeleting first node from SinglyLinkedList");
//		System.out.println("Deleted node of SLL " + sll.deleteFirst().data);
//		sll.display();

//		System.out.println("\nDeleting Last node from SinglyLinkedList");
//		System.out.println("Deleted node of SLL " + sll.deleteLast().data);
//		sll.display();

//		System.out.println("\nDeleting node at given position from SinglyLinkedList");
//		System.out.println("Deleted node of SLL " + sll.deleteAtPosition(1));
//		sll.deleteAtPosition(1);
//		sll.display();

//		System.out.println("\nSearching a node in SinglyLinkedList");
//		System.out.println("Enter key to search");
//		Scanner sc = new Scanner(System.in);
//		int searchKey = sc.nextInt();
//		if (sll.findNode(searchKey)) {
//			System.out.println("SearchKey Found");
//		} else {
//			System.out.println("SearchKey Not Found");
//		}

//		System.out.println("\nReversing SinglyLinkedList");
//		listNode reverseLinkedList = sll.reverse();
//		sll.display(reverseLinkedList);

//		System.out.println("Finding middle node in SinglyLinkedList");
//		listNode middleNode = sll.getMidddleNode();
//		System.out.println("Middle node is : " + middleNode.data);

//		System.out.println("Accessing Nth node from end of SinglyLinkedList");
//		listNode nthNode = sll.getNthNodeFromEnd(3);
//		System.out.println("Second node from end of SLL is: "+nthNode.data);

//		System.out.println("Removing Duplicate node from SinglyLinkedList");
//		sll.removeDuplicateNode();
//		sll.display(sll.head);

		System.out.println("Inserting node into sorted SinglyLinkedList");
		sll.insertIntoSortedList(25);
		sll.display(sll.head);

		System.out.println("Deleting a given KEY from the SinglyLisnkedList");
		sll.deleteNode(30);
		sll.display(sll.head);
	}

	private listNode head;

	private static class listNode {
		private int data;
		private listNode next;

		public listNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void display(listNode head) {
		listNode current = head;
		if (current != null) {
			while (current != null) {
				System.out.print(current.data);
				if (current.next != null) {
					System.out.print("-->");
				}
				current = current.next;
			}
			System.out.println();
			return;
		}

		System.out.println("SinglyLinkedList is empty");
	}

	private int Length() {
		listNode current = head;
		int count = 0;
		while (current != null) {
			count = count + 1;
			current = current.next;
		}
		// System.out.println("Length is : "+count);
		return count;
	}

	private void insertAtFirst(int value) {
		listNode newNode = new listNode(value);
		newNode.next = head;
		head = newNode;
	}

	private void insertAtEnd(int value) {
		listNode newNode = new listNode(value);
		if (head == null) {
			head = newNode;
			return;
		}

		listNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	private void insertInBetween(int value, int position) {
		listNode newNode = new listNode(value);
		listNode current = head;
		int count = 1;
		if (position == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}
		if (position > Length()) {
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			return;
		}

		while (count < position - 1) {
			current = current.next;
			count++;
		}
		newNode.next = current.next;
		current.next = newNode;
	}

	private listNode deleteFirst() {
		if (head == null) {
			return null;
		}

		listNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}

	private listNode deleteLast() {
		if (head == null) {
			return null;
		}

		listNode current = head;
		listNode previous = head;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}

	private void deleteAtPosition(int position) {
		if (position == 1) {
			head = head.next;

		}

		else {
			int count = 1;
			listNode current = head;
//			listNode previous = head;
			while (count < position - 1) {
//				previous = previous.next;
				current = current.next;
				count++;
			}
//			listNode current = previous.next;
//			previous.next = current.next;
			current.next = current.next.next;
		}
	}

	private Boolean findNode(int searchKey) {
		if (head == null) {
			return null;
		}

		listNode current = head;
		while (current != null) {
			if (current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	private listNode reverse() {
		if (head == null) {
			return head;
		}

		listNode current = head;
		listNode previous = null;
		listNode next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	private listNode getMidddleNode() {
		if (head == null) {
			return head;
		}

		int length = Length();
		System.out.println(length / 2);
		listNode fastPtr = head;
		listNode slowPtr = null;
		System.out.println(Length());
		if (length > 3 && ((length % 2) != 0)) {
			System.out.println("Inside odd");
			while (fastPtr != null && fastPtr.next != null) {
				slowPtr = fastPtr;
				fastPtr = fastPtr.next.next;// odd
			}
		} else if (length > 3 && ((length % 2) == 0)) {
			System.out.println("Inside even");
			while (fastPtr != null && fastPtr.next.next != null) {
				slowPtr = fastPtr;
				fastPtr = fastPtr.next;// odd
			}
		} else {
			while (fastPtr.next != null) {
				slowPtr = fastPtr;
				fastPtr = fastPtr.next;
			}
		}

		return slowPtr;
	}

	private listNode getNthNodeFromEnd(int n) throws IllegalAccessException {
		if (head == null) {
			return head;
		}

		int count = 0;
		if (n <= 0) {
			throw new IllegalAccessException("The given value is less than Zero");
		}

		listNode refPtr = head;
		listNode mainPtr = head;

		while (count < n) {
			if (refPtr == null) {
				throw new IllegalAccessException("The something");
			}
			refPtr = refPtr.next;
			count++;
		}

		while (refPtr != null) {
			mainPtr = mainPtr.next;
			refPtr = refPtr.next;
		}
		return mainPtr;
	}

	private void removeDuplicateNode() {
		if (head == null) {
			return;
		}

		listNode current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			}
			current = current.next;
		}
	}

	private listNode insertIntoSortedList(int value) {
		listNode current = head;
		listNode newNode = new listNode(value);
		listNode temp = null;

		if (head == null) {
			head = newNode;
			return head;
		}

		while (current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}

	private void deleteNode(int key) {
		listNode current = head;
		listNode temp = null;

		if (current != null && current.data == key) {
			head = current.next;
			return;
		}

		while (current != null && current.data != key) {
			temp = current;
			current = current.next;
		}

		if (current == null) {
			System.out.println(new KeyNotPresentException());
			return;
		}

		temp.next = current.next;
	}

}
