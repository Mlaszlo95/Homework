package feladat2.teszt;

import java.util.Scanner;
import java.io.IOException;

import feladat2.Dimensionalfigure;
import feladat2.Rectangular;
import feladat2.Triangle;
import feladat2.exceptions.*;



public class Teszt {
	public static int readInputSides(String type) throws MinusValueException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Oldal "+type+": ");
		int side = Integer.parseInt(sc.nextLine());
		if(side<=0) {
			
			throw new MinusValueException();
		}
		return side;
	}
	public static boolean isItTriangle(int a, int b, int c) throws ItIsNotTriangle{
		
		if(a+b>=c) {
			return true;
		}else {
			throw new ItIsNotTriangle();
		}
		
		
	}
	public static boolean isItRectangular(int a, int b) throws ItIsNotRectangular{
		if(a == b) {
			throw new ItIsNotRectangular();
		}else{
			return true;
		}
	}
	
	public static void main(String [] angs) {
		int a = 1,b = 1,c = 1;
		//read Triangle
		try {
			a = readInputSides("Háromszög");
			b = readInputSides("Háromszög");
			c = readInputSides("Háromszög");
		}
		catch(MinusValueException e) {
			e.printStackTrace();
		}
		
		try {
			if(isItTriangle(a,b,c)) {
				Dimensionalfigure tria = new Triangle(a,b,c);
			}
		}catch(ItIsNotTriangle e) {
			e.printStackTrace();
		}
		//Rectangular
		
		try {
			a = readInputSides("Négyzet");
			b = readInputSides("Négyzet");
		}
		catch(MinusValueException e) {
			e.printStackTrace();
		}
		
		try {
			if(isItRectangular(a,b)) {
				Dimensionalfigure rectan = new Rectangular(a,b);
			}
		}catch(ItIsNotRectangular e) {
			e.printStackTrace();
		}
		
	}
}
