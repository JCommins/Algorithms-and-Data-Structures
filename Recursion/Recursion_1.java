/* 
 * Problem Statement: 
 * Identify the output that the following Java code produces and explain your reasoning clearly.
 */

public class Recursion_1{
   public static void main(String[] args){
       System.out.println(method(14));
   }
  
   public static int method(int number){
       if (number % 7 == 3){
    	    return 5; 
	   }
       System.out.println("hello");
       System.out.println(number);
       return method((number % 5) + 3) - 2;
       
   }
}

/* 
   Output: 

   hello
   14
   hello
   7
   hello
   5
   -1
   
   Notes: Brackets executed only until base case satisfied => only then can method be returned 
          The returned int represents the (inside of) 'brackets'and works back up each equation 
	  but this time incorporating the full return statement (i.e => (bracket return) -2;) 
*/
