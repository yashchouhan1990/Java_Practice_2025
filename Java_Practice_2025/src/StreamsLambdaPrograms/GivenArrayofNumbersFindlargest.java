package StreamsLambdaPrograms;

import java.util.Arrays;
import java.util.OptionalInt;

public class GivenArrayofNumbersFindlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= new int[] {4,5,68,3,4,5};
		
		//convert to stream
		OptionalInt opt = Arrays.stream(num).max();
		
		//Check optional has value
		opt.ifPresent(System.out::println);
		

	}

}
