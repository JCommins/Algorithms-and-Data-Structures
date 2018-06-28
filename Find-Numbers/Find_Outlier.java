/*
 * Of three numbers find the number furthest away from the other two.
 * This is Phil's solution.
*/
//import java.util.Scanner;
//import java.lang.Math;
//import static java.lang.Math.abs; 

import java.util.*; 

public class Find_Outlier {
	public static void main(String args[]) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter three numbers: ");
		int one=input.nextInt();
		int two=input.nextInt(); 
		int three=input.nextInt();

		int min = Math.min(Math.min(one,two),three); //smallest of three numbers
		int max = Math.max(Math.max(one,two),three); //largest of three numbers
		int middle = one+two+three-min-max;
		
		//If all the points are the same distance from each other => no outlier
		if(Math.abs(min-middle)==Math.abs(max-middle))
			System.out.println("NA");
		//If the min is further away from the middle than the max => the min is the outlier
		else if(Math.abs(min-middle)>Math.abs(max-middle)) 
			System.out.println(min);
		//If the max is further away from the middle than the min the max is the outlier
		else 
		System.out.println(max);
	}
}