package hazi_5.teszt;

import java.util.Scanner;

import hazi_5.Book;

public class teszt {
	public static void main(String [] angs) {
		int n = 2;
		Book[] b = new Book[n];

		Scanner sc = new Scanner(System.in);
		//String BookName,String author,int pageNumber
		for(int i = 0; i < n; i++) {
			String BookName = sc.nextLine();
			String author = sc.nextLine();
			int pageNumber = Integer.parseInt(sc.nextLine());
			b[i] = new Book(BookName,author,pageNumber);
		}
		int j=0;
		Book max = b[0];
		Book seged;
		Book[] even = new Book[n];
		for(int i = 0; i < b.length; i++) {
			seged=b[i];
			if(seged==Book.LongerThanOther(seged,max)){
				max=b[i];
			}
			if(Book.evenPageNumber(seged)) {
				even[j]=b[i];
				j++;
			}
		}
		sc.close();
	}
}
