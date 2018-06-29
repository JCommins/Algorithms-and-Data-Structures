/*
 * Given a number of coin tosses and how likely a coin is to land on heads,
 * what is the probability that the majority of coin tosses will be heads?
 * The goal is to read in a number of fair coin tosses, and the probability that a given coin toss will produce heads, 
 * and output the probability that the majority of coin tosses will be heads, rounded to the nearest percent.
 * Based on Monte Carlo method.
*/

import java.util.Scanner;

public class Biased_Coin{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of coin tosses: ");
		int tosses = input.nextInt();
		System.out.println("Enter the % chance of landing on heads: ");
		int prob = input.nextInt();

		int success = 0;
		double sim = 100000; 
		
		for(int i = 0; i < sim; i++){
			//Reset the counter for each simulation
			int count = 0; 
			
			for(int j = 0; j < tosses; j++){
				if((Math.random()*100) <= prob)
					count++; //Count how many times we get a head
			}
			//If more than half the tosses are heads
			if(count > tosses/2) 
		    //Increment the number of successful simulations
				success++; 
		}
		//Calculate the percentage chance of getting majority heads
		int result = (int)(Math.round((success/sim)*100)); 

		System.out.println(result+ "%");
	}
}
