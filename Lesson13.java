import java.util.Arrays;

public class Lesson13{
	
	public static void main(String[] args){
		
		String randomString = "I'm just a random string.";
		
		String gotToQuote = "He said, \"I'm here\"";
		
		int numTwo = 2;
		
		System.out.println(randomString + " " + gotToQuote);
		System.out.println(randomString + " " + numTwo);
		
		String uppercaseStr = "BIG";
		String lowercaseStr = "big";
		
		if(uppercaseStr.equals(lowercaseStr))
		{
			System.out.println("They're equal");
		}else{System.out.println("They aren't equal.");}
		
		if(uppercaseStr.equalsIgnoreCase(lowercaseStr))
		{
			System.out.println("They're equal.");
		}
		
		String letters = "abcde";
		String moreLetters = "fghijk";
		
		System.out.println("2nd character: " + letters.charAt(1));
		
		System.out.println(letters.compareTo(moreLetters));
		
		System.out.println(letters.contains("abc"));
		
		System.out.println(letters.endsWith("de"));
		
		System.out.println(letters.indexOf("cd"));
		
		System.out.println("Length: " + letters.length());
		
		System.out.println(letters.replace("abc", "xy"));
		
		String[] letterArray = letters.split("");
		
		System.out.println(Arrays.toString(letterArray));
		
		char[] charArray = letters.toCharArray();
		
		System.out.println(Arrays.toString(charArray));
		
		System.out.println(letters.substring(1, 4));
		
		System.out.println(letters.toLowerCase());
		
		String randString = "            abdajwd              ";
		
		System.out.println(randString.trim());
		
		StringBuilder randSB = new StringBuilder("A random value");
		
		System.out.println(randSB.append(" again"));
		
		System.out.println(randSB);
		
		System.out.println(randSB.delete(15, 21));
		
		System.out.println(randSB.capacity());
		
		randSB.ensureCapacity(60);
		
		System.out.println(randSB.capacity());
		
		System.out.println(randSB.length());
		
		randSB.trimToSize();
		
		System.out.println(randSB.capacity());
		
		System.out.println(randSB.insert(1, "nother"));
		
		String oldSB = randSB.toString();
		
		//charAt()
		//indexOf()
		//lastIndexOf()
		//subString()
		
		//indexOf(StringToLookFor, IndexStartPosition)
		
		//lastIndexOf() works like indexOf except it starts from the end of the string
		
		//startsWith
	}
}