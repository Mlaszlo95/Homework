package feladat1;

public class Employeed {
	private String Name;
	private int Payment;
	public Employeed(String Name,int Payment) {
		this.Name=Name;
		this.Payment = Payment;
	}
	public Employeed(String Name) {
		this.Name = Name;
		this.Payment = 250000;
	}
	public void extraPayment(int Plusz) {
		this.Payment=Payment + Plusz;
	}
	public String toString() {
		return "Név: "+ Name + ". Fizetés: "+Payment+"\n";
	}
}
