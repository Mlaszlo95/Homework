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
			return "K�v�r";
		}else {
			return "Egy�bb";
		}
				
		
	}
	public String toString() {
		return "n�v: " +name+" .Tests�ly: "+weight+" .Tests�lyindex: "+height_Index() ;
	}
}
