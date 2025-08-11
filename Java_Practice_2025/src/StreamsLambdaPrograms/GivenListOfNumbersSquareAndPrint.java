package StreamsLambdaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GivenListOfNumbersSquareAndPrint {
	//Q4- Given list of number ->
	//Square and print them
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		//convert into stream
		nums.stream()
			.map(num->num*num)
			.forEach(System.out::println);
			
		
	}

}
