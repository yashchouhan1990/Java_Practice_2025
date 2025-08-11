package StreamsLambdaPrograms;

import java.util.ArrayList;
import java.util.List;

public class GivenListOfStringSortPrintInAlphabaticalOrder {

	//Q1 Given list of String ->
	//Sort and print them in uppercase in Alphabatical order
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		
		//Convert it into streams
		fruits.stream()
		.sorted()					
//		.map(name->name.toUpperCase()) // lambda expression
		.map(String::toUpperCase)
		.forEach(System.out::println);	 //Method reference

	}

}

/*
Output;
APPLE
APPLE
BANANA
GRAPES
GRAPES
ORANGE 
 
 * */
