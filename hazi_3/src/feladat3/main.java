package feladat3;

import java.util.Arrays;


public class main {

	public static void main(String[] args) {
		int[] myArray ={0,2,5,1,6};
		java.util.Arrays.sort(myArray); 
		for(int i = 0; i<myArray.length;i++) {
			System.out.println(myArray[i]);
		}
		System.out.println("Talat:"+Arrays.binarySearch(myArray,5));
	}

}
