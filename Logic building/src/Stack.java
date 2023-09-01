
public class Stack {

	private class Node {

		private int data;

		private Node next;

		public Node(int data) {

			this.data = data;

		}

		public int getData() {

			return data;

		}

		public Node getNext() {

			return next;

		}

		public void setNext(Node next) {

			this.next = next;

		}

	}

	private Node first, last;

	public void push(int data) {

		Node n = new Node(data);

		if (first != null) {

			n.setNext(first);

		}

		first = n;

	}

	public int pop() {

		if (first != null) {

			int data = first.getData();

			first = first.getNext();

			return data;

		} else {

			System.err.println("Stack in empty");

			return 0;

		}

	}

	public void print() {

		Node t = first;

		while (t != null) {

			System.out.println(t.getData());

			t = t.getNext();

		}

	}

}
