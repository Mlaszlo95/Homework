package feladat_1;

import java.time.LocalDate;

public class Book extends Product{
	private String author;
	private int releasYear;
	private int pageNumber;
	
	public Book(String name,int price,int taxKey,int pageNumber,String author){
		super(name,price,taxKey);
		this.author=author;
		this.releasYear=LocalDate.now().getYear();
	}
	public String getAuthor() {
		return author;
	}

	
	public double priceEach() {
		return brutoPrice()/pageNumber;
	}
}
