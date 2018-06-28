/*
Problem Statement
The goal is to read in a list of integers into an array and output the one which is closest to the average. 
For example the average of 4, 8, 2, 3 and 5 is 4.25, and 4 is the closest to this. 
If there are two values equally close then choose the one which was earliest in the list.*/


import java.util.*; 

public class Closest_to_Average{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in); 
		//get array size input from user
		System.out.println("Enter the amount of numbers to get the average of: "); 
		int n = input.nextInt(); 
		//create array using n for its size
		int arr[] = new int[n]; 
		//variable to store total
		double total = 0; 
		
	//fill array with user input
	for (int i = 0; i <n; i++){
		System.out.println("Enter a number: "); 
		arr[i] = input.nextInt(); 
		//compute total while taking in input
		total += arr[i];	
	}
	//get average
	double avg = total/n; 
	//set record for first number in array 
	double closest = Math.abs(arr[0] - avg); 
	int index = 0; 
	
	//array to keep track of closest number to average
	
	for(int i = 0; i<n; i++){
		double record = Math.abs(arr[i] - avg); 
		if (record < closest){
			closest = record; 
			//stores the array index of closest
			index = i; 
		}
		
	}
	System.out.print(arr[index]); 
	
	}

}
