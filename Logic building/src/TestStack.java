
public class TestStack {

	public static void main(String[] args) {

		Stack st = new Stack();

		System.out.println("Push");

		st.push(20);

		st.push(30);

		st.push(10);

		st.push(50);

		st.print();

		System.out.println("Pop");

		st.pop();

		st.print();

	}

}
