package feladat_1;

public abstract class Product implements Seller{
	private String name;
	private int price;
	private int taxKey;
	//interfaces
	String baseValute;
	
	public Product(String name, int price, int taxKey){
		this.name=name;
		this.price=price;
		this.taxKey=taxKey;
	}
	
	public int brutoPrice() {
		return price*(1+taxKey/100);
	}
	public String getName() {
		return name;
	}
	
	public void riseNetoToBruto() {
		this.price=brutoPrice();
	}
	@Override
	public void setBasePrice(int basePrice) {
		this.price = basePrice;
	}
	@Override
	public int getBasePrice() {
		return price;
	}
	public void setBaseValute(String baseValute) {
		this.baseValute=baseValute;
	}
	public String getBaseValute() {
		return baseValute;
	}

}
