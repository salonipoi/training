
public class TestDoublyLL {

	public static void main(String[] args) {
		LinkedList lst = new LinkedList();
		lst.add(10);
		lst.add(20);
		lst.add(30);

		lst.print();
System.out.println("After add");
		lst.addAfter(20, 25);
		lst.addAfter(30, 35);
		lst.print();
System.out.println("Before add");
		lst.addBefore(20, 15);
		lst.addBefore(10, 5);
		lst.print();
System.out.println("Remove :");
		lst.remove(20);
		lst.remove(5);
		lst.print();
		lst.print();
	}

}
