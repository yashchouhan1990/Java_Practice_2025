package StreamsLambdaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GivenListOfNumberFindLarget {
	// Q5: Given list of number->
	// find the larget and print it
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		//convert into stream
		Optional<Integer> opt=nums.stream()
//			.max((o1,o2)-> o1.compareTo(o2));
			.max(Integer::compareTo);
			
			
			if(opt.isPresent()){
				Integer largest=opt.get();
				System.out.println(largest);
			}
					

	}

}
