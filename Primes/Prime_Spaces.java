
/*Spacing between primes Problem Statement

The goal is to read in a number N and output the distance between the prime number that precedes it, and the prime that follows it. 
If the number itself happens to be prime, then output the distance to the subsequent prime. 
For example, if N is 7, then output 4, because the next prime is 11, which is 4 away.*/
import java.util.Scanner;

public class Prime_Spaces {
	public static void main(String args[]) throws Exception{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to output its prime distance (prime before to prime after it): "); 
		
		int n = input.nextInt(); //Take in the size of the array
		
		int arr[] = new int[n];
		
		int primeCount = 1; 
		
		arr[0] = 2; 
		
		for(int i = 2; i<(n*2); i++){
			
			boolean primeTest = true; 
			 
			for(int j = 0; j<primeCount; j++){
				
				if(i%arr[j]==0){
					
					primeTest = false; 
					j = primeCount; 
					//System.out.println("j =" +j); 
				}
			}
			
			if(primeTest){
				
				arr[primeCount] = i; 
				//System.out.println("arr[primeCount] = " +arr[primeCount]); //e.g. 7 => 3,5,,11,13
				primeCount++; 
				//System.out.println(primeCount);
			}
			
		}
		
		int higher = 0; 
		int lower = 0; 
		
		for (int i = 0; i<primeCount; i++){
			
			if(arr[i] > n){
				
				higher = arr[i]; 
				lower = arr[i-1]; 
				i = primeCount; 
			}
		}
	
		//int distance = higher - lower; 
		
		System.out.println(higher - lower); 
		
	}
}
