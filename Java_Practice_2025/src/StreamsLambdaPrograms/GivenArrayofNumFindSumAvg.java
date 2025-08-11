package StreamsLambdaPrograms;

import java.util.Arrays;
import java.util.OptionalDouble;

public class GivenArrayofNumFindSumAvg {

	// Q8 - Given array of Numbers ->
	// find sum and average
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] num= new int[] {4,5,68,3,4,5};
		
		//convert into streams
		int sum= Arrays.stream(num).sum();
		System.out.println("Sum" +sum);
		
		OptionalDouble opt=Arrays.stream(num).average();
		opt.ifPresent(System.out::println);

	}

}

/*
Output:
	Sum89
	14.833333333333334
	
	*/