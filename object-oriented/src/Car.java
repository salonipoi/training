
public class Car {

	private String model;
	private String[] features;

	public Car(String model, String... features) {	//var-args
		// super();
		this.model = model;
		this.features = features;
	}

	public void specs() {
		System.out.println("Features of " + model);
		for (String f : features)
			System.out.println("> " + f);

	}

	public static void main(String args[]) {
		// String[] af = {"Keyless","AC","Power Window"};
		Car alto = new Car("Suzuki Alto", "Keyless", "AC", "Power Window");
		alto.specs();

		// String[] sf = {"MG Astor","ABS","Keyless","Auto","SunRoof"};

		Car astor = new Car("MG Astor", "ABS", "Keyless", "Auto", "SunRoof");
		astor.specs();
	}
}
