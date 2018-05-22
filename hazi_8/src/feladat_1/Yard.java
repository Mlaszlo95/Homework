package feladat_1;

public class Yard implements Seller{
	int price;
	int devizType;
	String baseValute;
	int size;
	String location;
	
	public Yard(String location,int price,int devizType,int size) {
		this.price=price;
		this.devizType=devizType;
		this.size=size;
		this.location=location;
	}
	public double theYardSquadrakMeterPrice() {
		return Math.pow(size, 2)*price;
	}

	@Override
	public void setBasePrice(int basePrice) {
		this.price = basePrice;
	}
	@Override
	public int getBasePrice() {
		return price;
	}
	@Override
	public void setBaseValute(String baseValute) {
		this.baseValute=baseValute;
	}
	public double calculateTheYardSquadrakMeterToEuro(int euroPrice) {
		this.devizType = euroPrice;
		return theYardSquadrakMeterPrice()/devizType;
	}
	@Override
	public String getBaseValute() {
		return baseValute;
	}
	@Override
	public String toString() {
		return "Hely: "+location+". Ár(m^2): "+theYardSquadrakMeterPrice();
	}
}
