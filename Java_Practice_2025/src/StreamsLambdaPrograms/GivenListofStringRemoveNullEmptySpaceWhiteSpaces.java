package StreamsLambdaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GivenListofStringRemoveNullEmptySpaceWhiteSpaces {
	//Q2 : Given List of String ->
	// Remove null, whitespaces, null and print them
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add(" ");
		fruits.add("Grapes");
		fruits.add("");
		fruits.add("Banana");
		fruits.add("Watermelon");
		
		//convert to streams
		
		fruits.stream()
//			.filter(str->str!=null && !str.trim().isEmpty())
			.filter(str->Objects.nonNull(str) && !str.trim().isEmpty() )
			.forEach(System.out::println);
		
	}

}
