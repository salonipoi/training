//the state cannot be changed once set at the time of reading the object
public class Aadhar {
	private final long uid;
	private final String retina;

	public Aadhar(long uid, String retina) {
		this.uid = uid;
		this.retina = retina;
	}

	public long getUid() {
		return uid;
	}

	public String getRetina() {
		return retina;
	}

	@Override
	public String toString() {
		return "Aadhar [uid=" + uid + ", retina=" + retina + "]";
	}

	public static void main(String args[]) {
		Aadhar a = new Aadhar(1001, "brown");
		System.out.println(a);

	}
}
