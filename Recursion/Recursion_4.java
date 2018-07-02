
public class Recursion_3{	
	public static void main (String [] args){		
		System.out.println(mystery("Start"));	
	}

	public static String mystery (String input){		
		if(input.length()>10){	
			return "Complete"; 
		}
		
		System.out.println("Running~Q");
		return (mystery(input +"x")+ "OK"); 		
	}	
}

/* Output: 
 * Running~Q
 * Running~Q
 * Running~Q
 * Running~Q
 * Running~Q
 * Running~Q
 * CompleteOKOKOKOKOKOK
 */
