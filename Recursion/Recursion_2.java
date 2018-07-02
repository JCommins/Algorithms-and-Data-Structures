/*
 * Problem Statement: 
 * 
 * Identify the output that the following Java code produces and explain your reasoning clearly.
 *
 */ 
public class Recursion{
	public static void main(String[] args){
        System.out.println(method(3));
    }

    public static int method(int number){
        if (number > 30){
        	return 7; 
    	}
        System.out.println("hello");
        //System.out.println(number);
        //NB. The 8 is ignored until base case is satisfied
        //then the returned number represents each resolved bracket-case back up the chain until the first method is reached
        //=> (returned number) - 8 => -1
        //=> (-1) -8 = -9
        //=> (-9) -8 = -17
        //=> (-17) -8 = -25
        //*N.B. Have to start return back at where the base case was resolved
        return method(number + 7) - 8;  
    }
}
