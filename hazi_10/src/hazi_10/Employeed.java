package hazi_10;

public class Employeed extends Adult{
	private static int pensiontLvl=65;
	private int payment;
	public Employeed(String name, int age, String jobPlacement, int payment) {
		super(name,age,jobPlacement);
		this.payment = payment;
	}
	
	public int getPayment(){
		return payment;
	}
	
	@Override
	public String toString(){
		return super.toString()+"Fizetes: "+payment;
	}
}
