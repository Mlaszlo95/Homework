package feladat2;

import java.time.LocalDate;
import java.util.Date;

public class Book {
	private String BookName;
	private String author;
	private int releasYear;
	private LocalDate releasDate;
	private int price;
	
	public Book(String BookName,String author,int releasYear,int price){
		this.BookName=BookName;
		this.author=author;
		this.releasYear=releasYear;
		this.price=price;
	}
	public Book(String BookName,String author){
		this.BookName=BookName;
		this.author=author;
		this.releasDate=LocalDate.now();
		this.price=2500;
	}
}
