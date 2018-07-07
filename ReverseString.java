package quiz_question_java;


//Java program to Reverse a String  by
//converting string to characters  one
//by one

public class ReverseString {
	
	public void reverseString()
	{
		String name="keshav";
		// convert String to character array
        // by using toCharArray
		char[] name1=name.toCharArray();
		for(int i=name1.length-1;i>=0;i--) {
			System.out.print(name1[i]);
			
		}
	}
		/**
		 * Using ForLoop Method and charAt
		 */
		public void reverseString1() {
			String name1="Singh";
			int len=name1.length();
			String rev=" ";
			for(int i=len-1;i>=0;i--) {
				rev=rev+name1.charAt(i);
			}
		
		System.out.println(rev);
		}
		/**
		 * using String Buffer Class
		 */
		
		public void reverseString2() {
			String name2="Sukanaya";
			StringBuffer sf=new StringBuffer(name2);
			System.out.println(sf.reverse());
		}
		
		
		
public static void main(String[] args) {
	ReverseString obj1=new ReverseString();
	obj1.reverseString();
	obj1.reverseString1();
	obj1.reverseString2();
}
}
