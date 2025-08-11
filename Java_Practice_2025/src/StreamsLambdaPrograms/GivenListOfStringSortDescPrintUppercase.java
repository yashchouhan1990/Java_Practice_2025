package StreamsLambdaPrograms;

import java.util.ArrayList;
import java.util.List;

public class GivenListOfStringSortDescPrintUppercase {
	//Q2 - Given list of String ->
	//  Sort in desc order and convert in Upper case and print them
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Jamun");
		fruits.add("Banana");
		fruits.add("Watermelon");
		
		fruits.stream()
			  .sorted((f1,f2)->Integer.compare(f2.length(), f1.length()))
//			  .map(name->name.toUpperCase())
			  .map(String::toUpperCase)								// Method Reference
			  .forEach(System.out::println);
		
		

	}

}
