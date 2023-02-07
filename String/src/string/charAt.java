package string;

public class charAt {

	public static void main(String[] args) {
		String Name="Indrajeet Patil ";
		String Name1="Patil ";
		System.out.println(Name.indexOf("P")); //Returns the index within this string of the first occurrence of the specified substring
		System.out.println(Name.isEmpty()); //Returns true if, and only if, length() is 0.
		System.out.println(Name.isBlank());  //Returns true if the string is empty or contains only white space 
		System.out.println(Name.lastIndexOf("e"));//Returns the index within this string of the last occurrence of the specified substring
		System.out.println(Name.trim());// all leading and trailing space removed.
		System.out.println(Name.matches(Name1));
		System.out.println(Name.replace('P', 'p'));//Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
		
	
	}
}
