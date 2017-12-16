package e29;

public class Student extends Person {
	
	private int credits;

	public Student(String name, String address) {
		super(name, address);
		this.credits = 0;
	}
	
	public void study() {
		credits++;
	}
	
	public int credits () {
		return this.credits;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n \t" + "credits " + credits;
	}

}