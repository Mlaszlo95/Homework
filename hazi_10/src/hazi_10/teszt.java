package hazi_10;

import java.util.*;
import java.io.IOException;

import exceptions.WMinPaymException;
import hazi_10.*;



public class teszt {
	static int readFromImputJob(int age) throws WMinPaymException {
		Scanner sc = new Scanner(System.in);
		
		int payment = Integer.parseInt(sc.nextLine());
		if(age>=18 && age<=70) {
			if(payment<=138000) {
				sc.close();
				throw new WMinPaymException();
			}
		}
		sc.close();
		return payment;
	}
	
	public static void main(String [] angs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nev: ");
		String name=sc.nextLine();
		System.out.println("Életkor: ");
		int age=Integer.parseInt(sc.nextLine());
		Person a;
		int payment = 0;
		
		if(age<18){
			System.out.println("Iskola: ");
			String school=sc.nextLine();
			a = new Child(name,age,school);
		}else {
			
			System.out.println("Munkahely: ");
			String job=sc.nextLine();
			if(job!=null) {
				
				try {
					payment=readFromImputJob(age);
				}catch(WMinPaymException e) {
					e.printStackTrace();
				}
				
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
		sc.close();
	}
}
