import com.ey.emp.Clerk;
import com.ey.emp.Employee;
import com.ey.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {

		Manager m1 = new Manager("Mike", 5000, 2000);

		Clerk c1 = new Clerk("Mona", 3000, 1200);
		showSalary(m1);
		showSalary(c1);
	}
	
	private static void showSalary(Employee e) {//polymorphism
		
		if( e instanceof Manager)//employee e can point to both manager and clerk
			System.out.println("Manager Salary: " + e.getSalary());
		else
			System.out.println("Clerk Salary: " + e.getSalary());
	}
	/*
	 * private static void showSalary(Clerk c1) { //method overloading
	 * 
	 * System.out.println("Clerk Salary:" + c1.getSalary()); } private static void
	 * showSalary(Manager m1) {
	 * 
	 * System.out.println("Manager Salary:" + m1.getSalary());
	 * 
	 * }
	 */

}