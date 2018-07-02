/*
 * Number of primes under a limit: The goal is to read in a number N and output the number of primes below that number. 
 * For example, if N is 11, then the output is 4, because there are 4 primes below 11, namely, 2, 3, 5, and 7.
 */

import java.util.*; 

public class Primes_Below {
	public static void main(String args[] ) throws Exception{		
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter a number and find how many prime numbers precede it: ");		
		int n = input.nextInt(); 		
		int count = 0;
		
		for(int i = n-1; i >= 2; i--){ 
		   if(isPrime(i)){
		      count++;
		   }
		}
		
		System.out.print(count);
		}
	
	//prime number => divisible by only itself and one
	public static boolean isPrime(int x){ 
		
		for(int i = 2; i <= Math.sqrt(x); i++){
			if(x%i == 0){
			   return false; 
			}
		}	
		return true; 	
	}	
}
