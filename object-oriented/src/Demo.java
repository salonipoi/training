public class Demo<Z> {
	private Z data;

	/**
	 * public Demo (Z data){ private Z data; // data type is object ; you can create
	 * an object of any data type; you can pass // anything
	 */
	public Demo(Z data) {
		this.data = data;

	}

	public Z getData() {
		return data;

	}

	public void setData(Z data) {
		this.data = data;

	}

	public static void main(String args[]) {
		Demo<String> d1 = new Demo("Hola");
		// d1.setData(3.14);
		System.out.println(d1.getData());

		Demo<Integer> d2 = new Demo(99);
		// d2.setData("Bonjour");
		System.out.println(d2.getData());

		Demo<Person> d3 = new Demo(new Person("Kim", 11));
		System.out.println(d3.getData());
	}
}
