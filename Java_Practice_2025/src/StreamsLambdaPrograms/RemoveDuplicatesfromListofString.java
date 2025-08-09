package StreamsLambdaPrograms;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesfromListofString {

	//Q9 - Given list of String ->
	 //	 remove duplicates and print them
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruitnames = new ArrayList<>();
		fruitnames.add("Apple");
		fruitnames.add("Orange");
		fruitnames.add("Grapes");
		fruitnames.add("Apple");
		fruitnames.add("Banana");
		fruitnames.add("Grapes");
		
		System.out.println("Actual List:"+fruitnames);
		
		//Convert into stream
		fruitnames.stream()
				.distinct()
				.forEach(System.out::println);   /// This line uses Java's method reference feature and is commonly used with Streams or Collections.
	}

}
