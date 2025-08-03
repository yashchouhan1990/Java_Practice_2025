package basicPrograms;

import java.util.ArrayList;

public class AddEvenNumberToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an ArrayList to store even number
		ArrayList<Integer> evenNumbers= new ArrayList<Integer>();
		// Loop from 1 to 10
		for(int j=0; j<=10;j++)
		{
			// Check if the current number is even
			if(j%2==0)
				// Add the even number to the ArrayList
				evenNumbers.add(j);				
		}
		
		// Print the contents of the ArrayList
		System.out.println("Even numbers from 1 to 10: " + evenNumbers);
				
	}

}
