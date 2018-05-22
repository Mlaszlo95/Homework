package feladat_1;

public interface Seller {
	int price = 1;
	String baseValute = "Ft";
	
	public void setBasePrice(int intoBasePrice);
	public void setBaseValute(String intBaseValute);
	public int getBasePrice();
	public String getBaseValute();
}
