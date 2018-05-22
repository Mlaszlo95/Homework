package feladat6_mypersons;

public class Adult extends Person{
	String jobPlacement;
	public Adult(String name, int age, String jobPlacement) {
		super(name,age);
		this.jobPlacement=jobPlacement;
	}
	
	@Override
	public String toString() {
		return super.toString()+". Munkahely: "+jobPlacement;
	}
}
