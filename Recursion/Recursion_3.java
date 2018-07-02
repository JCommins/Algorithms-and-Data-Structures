
public class Recursion{
	public static void main(String args[]){
		System.out.println(method(5)); 		
	}

	public static int method(int num){
		if(num == 2){
		   return 0; 
		}else{
		   System.out.println(num); 
		   return method(num -1) +1; 
		}
	}		
}

/* 
 * Output: 
 * 5 
 * 4
 * 3
 * 3
*/

	/*5
			  4
			  3
			  3
			  */