package StreamsLambdaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNameswithGivenLetter {

	// Q10- Given list of String -> 
	// get the names starting with letter "R" , convert to a list and print
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> usernames = new ArrayList<>();
		usernames.add("Rakesh");
		usernames.add("Yash");
		usernames.add("Roy");
		usernames.add("Jyothi");
		usernames.add("Roni");
		usernames.add("Jyothi");
		
		//Convert it into stream
		
	List<String> names = usernames.stream()
				.filter(name -> name.startsWith("R"))     // lambda expression
				.collect(Collectors.toList());
	
	//System.out.println("Result "+names);
	names.forEach(System.out::println);
	/*
	for(String n : names)
	{
		System.out.println("Result "+n);
	}
	*/

	}

}
/*
Output:
	Rakesh
	Roy
	Roni
*/