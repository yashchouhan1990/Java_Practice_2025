package StreamsLambdaPrograms;

import java.util.ArrayList;
import java.util.List;

public class CountStringLength {

	//Q11 Given a list of String ->
	// Print the total count of names having length > 5
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> usernames = new ArrayList<>();
		usernames.add("Rakesh");
		usernames.add("Yash");
		usernames.add("Aman");
		usernames.add("Jyothi");
		
		//convert list into stream
		long count=usernames.stream()
				.filter(name->name.length()>5)
				.count();
		System.out.println("Total count of names having length greater than 5 : "+count);
		
		// Alternate approach
		
		List<String> unames = new ArrayList<>();
		unames.add("Rakesh");
		unames.add("Yash");
		unames.add("Aman");
		unames.add("Jyothi");
		
		int counter=0;
		for(String names : unames)
		{
			if (names.length() > 5)
				counter++;
		}
		System.out.println("Total count is :"+counter );

	}

}
