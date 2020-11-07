import java.util.Scanner; 

public class IsPrime{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check if it's prime: ");
		int primeNumberTest = input.nextInt(); 
		input.close(); 
		System.out.println(isPrime(primeNumberTest));		
	}
   
	//Prime number is only divisible by itself and 1
	public static boolean isPrime(int number){
		boolean prime = true; 
		if (number < 2){
			//return false; 
			prime = false; 
		}
		for(int i = 2; i < number; i++){
			if(number % i == 0){
				//return false; 
				prime = false; 
			}
		}
		return prime; 
	}
}

/*
 * prime numbers: 
 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 
 * 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 
 * 181, 191, 193, 197, 199, etc.
 */
