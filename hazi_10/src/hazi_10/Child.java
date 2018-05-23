package hazi_10;

public class Child extends Person{
	String schoolClass;
	public Child(String name, int age, String schoolClass){
		super(name,age);
		this.schoolClass=schoolClass;
	}
	@Override
	public String toString() {
		return super.toString() +" Iskola: "+ schoolClass;
	}
}
