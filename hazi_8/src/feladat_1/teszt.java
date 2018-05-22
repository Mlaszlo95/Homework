package feladat_1;

import java.util.Scanner;
import feladat_1.*;

public class teszt {
	static int n = 2;
	public static void main(String[] args) {
		Book[] b = new Book[n];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<n; i++) {
			String name = sc.nextLine();
			int taxKey = Integer.parseInt(sc.nextLine());
			int price = Integer.parseInt(sc.nextLine());
			int pageNumber = Integer.parseInt(sc.nextLine());
			String autor = sc.nextLine();
			b[i] = new Book(name,price,taxKey,pageNumber,autor);
		}
		String [] expensiveAutors = new String[n];
		int j=0;
		for(int i = 0; i<n; i++) {
			if(20<b[i].priceEach()) {
				expensiveAutors[j]=b[i].getAuthor();
				j++;
			}
		}
	}

}
