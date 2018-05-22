package feladat01;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double a,b,c,D,solution1,solution2,check,check2;
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		a = Double.parseDouble(sc.nextLine().replace(',','.'));
		System.out.println("b = ");
		b = Double.parseDouble(sc.nextLine().replace(',','.'));
		System.out.println("c = ");
		c = Double.parseDouble(sc.nextLine().replace(',','.'));
		
		if(Math.pow(b, 2) - 4 * a * c <= 0) {
			System.out.println("Nincs megoldas!");
		}else {
			D=Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		
			solution1=(-b+D)/2*a;
			solution2=(-b-D)/2*a;
			
			check=a*(Math.pow(solution1, 2)) + b*solution1 + c;
			check2=a*(Math.pow(solution2, 2)) + b*solution2 + c;
			
			//System.out.println(check +" "+check2);
			if(check == 0) {
				System.out.println("megoldas: "+solution1+"\n");
			}
			if(check2 == 0) {
				System.out.println("megoldas: "+solution2+"\n");
			}
		}
		sc.close();
	}

}
