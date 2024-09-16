package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "I am feeling Lucky";
		
		// reverse the string and show in the output
		
		String reversedString = "";
	
		for (int i=str1.length(); i>0; i--) 
		{ 
			reversedString = reversedString + str1.charAt(i-1);
		}
		
		System.out.println(reversedString);
		
		
		
		
		
		//int num1 = 10282023;
		 
		 // find the some of all the digits in num1
		
		int sumofDigits = 0;
		int reverseDigit = 0;
		for (int num1 = 10282023; num1 > 0; num1 /= 10) {
			int remainder = num1 % 10;
			reverseDigit = reverseDigit * 10 + remainder;
			sumofDigits += remainder;
			 System.out.println(remainder);
		}
         // sum of digits
		
		System.out.println(sumofDigits);
		
		
		
		
		// find out the reverse number of num1
		
		System.out.println(reverseDigit);
		
		
		
		// do not convert this number in to string
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
