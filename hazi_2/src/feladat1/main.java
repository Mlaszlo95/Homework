package feladat1;

public class main {

	//Euklidészi szám
	public static void main(String[] args) {
		int amoung=100,number=1;
		double counter=0;
		for(int i=0; i<=amoung;i++) {
			for(int j=1;number<=i;j++) {
				number=number*j;
				//System.out.println(number+",");
			}
			//System.out.println("\n");
			counter=counter + (double)1/number;
			//System.out.println((double)1/number+"\n");
			number=1;
		}
		System.out.println("Euk: "+counter);
	}

}
