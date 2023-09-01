
public class TestQueue {

	public static void main(String[] args) {

		Queue st = new Queue();

		System.out.println("Peek");

		st.peek(20);

		st.peek(30);

		st.peek(10);

		st.peek(50);

		st.print();

		System.out.println("Pop");

		st.pop();

		st.pop();

		st.pop();

		st.pop();

		st.pop();

		st.print();

	}

}
