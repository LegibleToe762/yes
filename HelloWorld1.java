public class HelloWorld1
{
	
	public static void main(String[] args)
	{
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt = 2100000000;
		long bigLong = 9220000000000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.141592653589793238;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randomChar = 64;
		char anotherChar = 'A';
		
		char escapedChars = '\f';
		
		String randomString = "I'm a random string";
		String anotherString = "Stuff";
		
		String andAnotherString = randomString + ' ' + anotherString;
		
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigByte);
		String intString = Integer.toString(bigInt);
		String longString = Long.toString(bigByte);
		String floatString = Float.toString(bigByte);
		String doubleString = Double.toString(bigByte);
		
		double aDoubleValue = 3.14152333242342342424;
		int doubleToInt = (int) aDoubleValue;
		
		int stringToInt = Integer.parseInt(intString);
		
		System.out.println(stringToInt);
	}
}