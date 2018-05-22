package hazi_5;

import java.time.LocalDate;
import java.util.Date;

public class Book {
	private String BookName;
	private String author;
	private String publisher;
	private int releasYear;
	private int pageNumber;
	private int price;
	

	public Book(String BookName,String author,int pageNumber,int price){
		this.BookName=BookName;
		this.author=author;
		this.releasYear=LocalDate.now().getYear();
		this.price=price;
		this.publisher="M�ra";
		this.pageNumber=pageNumber;
	}
	public Book(String BookName,String author,int pageNumber){
		this.BookName=BookName;
		this.author=author;
		this.releasYear=LocalDate.now().getYear();
		this.price=2500;
		this.publisher="M�ra";
		this.pageNumber=pageNumber;
	}
	public String toString() {
		return "N�v: "+BookName+" Szerz�: "+author+" Kiad�s�ve: "+releasYear+" Kiad�: "+publisher+" Oldalsz�m: "+pageNumber+"";
	}
	
	public static Book LongerThanOther(Book a, Book b) {
		if(a.pageNumber > b.pageNumber) {
			return a;
		}
		return b;
	}
	
	public static boolean evenPageNumber(Book a) {
		if(a.pageNumber%2==0) {
			return true;
		}
		return false;
	}
}


