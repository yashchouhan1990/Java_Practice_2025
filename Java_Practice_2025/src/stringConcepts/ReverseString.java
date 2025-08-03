package stringConcepts;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="YashChouhan";
		String reverse="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse+=str.charAt(i);
		}
		System.out.println("Original String: "+str);
		System.out.println("Reversed String: "+reverse);

		// 2. Another approach
		StringBuilder str2= new StringBuilder("HellowWorld");
		System.out.println("Original String for 2nd approach: "+str2);
		System.out.println("String reverse using in build function: "+str2.reverse());
		
	}

}

/*
Output:

	Original String: YashChouhan
	Reversed String: nahuohChsaY
	Original String for 2nd approach: HellowWorld
	String reverse using in build function: dlroWwolleH
*/