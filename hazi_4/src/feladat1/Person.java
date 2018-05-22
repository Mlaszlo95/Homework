package feladat1;

public class Person {
	protected String name;
	protected int height;
	protected int weight;
	
	public String height_Index() {
		int itt=weight/(height*height);
		if(itt < 18.5) {
			return "sovany";
		}else if(itt > 25) {
			return "Kövér";
		}else {
			return "Egyébb";
		}
				
		
	}
	public String toString() {
		return "név: " +name+" .Testsúly: "+weight+" .Testsúlyindex: "+height_Index() ;
	}
}
