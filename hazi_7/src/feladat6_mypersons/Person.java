package feladat6_mypersons;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return "Név: "+name+". Kor: "+age;
	}
	public Boolean areYouYounger(Person a) {
		if(a.getAge()<getAge()) {
			return true;
		}
		return false;
	}
}
