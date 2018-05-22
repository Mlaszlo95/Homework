package feladat2;


public class main {

	public static void main(String[] args) {
		int a,b,each=0,base=50;
		double c;
		for(a = 1; a<=base; a++) {
			for(b = a+1; b<=base;b++) {
				c=Math.pow(a, 2) + Math.pow(b, 2);
				c=Math.sqrt(c);
				if(c == (int)c ) {
					if(c<=base &&(a<b && a<c &&b<c)) {
						each++;
						System.out.println("a = "+a+" b = "+b+" c = "+(int)c+"\n");
					}
				}
			}
		}
		System.out.println("Osszeg: "+each);

	}

}
