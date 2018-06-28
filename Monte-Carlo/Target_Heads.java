/*
 * Given the number of tosses and a target number of heads to achieve
 * What's the probability that at some point you'll toss the target number of heads in a row?
*/
import java.util.*;

public class Target_Heads{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of coin tosses: ");
		int tosses = input.nextInt();
		System.out.println("Enter the target number for of heads in a row: ");
		int target = input.nextInt();

		int success = 0;
		double sim = 1000;

		for(int i = 0; i < sim; i++){
			//Reset the counter for each simulation
			int count = 0;
			int record = 0;

			for(int j = 0; j < tosses; j++){
				if(Math.random() > 0.5){
					//Count how many times we get a head
					count++; 
					//Record if we reach the target number of head tosses in a row
					if(count >= target) 
						record++;
					}else
						count = 0;
			}
			//If we reached the target number of heads once or more
			if(record >= 1) 
			//Increment the number of successful simulations
				success++; 
		}
		//Calculate the percentage chance of getting the target number of heads
		int result = (int)(Math.round((success/sim)*100)); 

		System.out.println(result+"% chance");
	}
}