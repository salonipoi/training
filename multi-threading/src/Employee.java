import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	private int empno;
	private String ename;
	private double salary;

	public Employee() {
	}

	public Employee(int empno, String ename, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(empno);
		out.writeUTF(ename);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		empno = in.readInt();
		ename = in.readUTF();
	}

	@Override
	public String toString() {
		return "Employee [empNo =" + empno + ",ename =" + ename + ",salary=" + salary + "]";

	}

}
