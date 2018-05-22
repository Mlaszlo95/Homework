package teszt;

import java.util.Scanner;

import feladat6_mypersons.*;

public class teszt {
	public static void main(String [] angs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nev: ");
		String name=sc.nextLine();
		System.out.println("Életkor: ");
		int age=Integer.parseInt(sc.nextLine());
		Person a;
		
		if(age<18){
			System.out.println("Iskola: ");
			String school=sc.nextLine();
			a = new Child(name,age,school);
		}else {
			
			System.out.println("Munkahely: ");
			String job=sc.nextLine();
			if(job!=null) {
				int payment = Integer.parseInt(sc.nextLine());
				a = new Employeed(name,age,job,payment);
			}else {
				a = new Adult(name,age,job);
			}
			
			
		}
		if(a instanceof Child) {
			System.out.println("Tanulo: \n");
			System.out.println(a.toString());
		}
		if(a instanceof Adult) {
			if(a instanceof Employeed) {
				System.out.println("Dolgozo felnõt: \n");
			}else {
				System.out.println("Felnõt: \n");
			}
			System.out.println(a.toString());
		}
		
	}
}
