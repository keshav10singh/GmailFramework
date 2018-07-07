package quiz_question_java;

import java.util.Scanner;

/**
 * Reverse user input string
 * @author keshav.singh
 *
 */
public class ReverseUserInputString {
	
	public void reverseString() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String");
		String name=scn.next();
		
		char[] name1=name.toCharArray();
		for(int i=name1.length-1;i>=0;i--) {
			System.out.print(name1[i]);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseUserInputString obj1=new ReverseUserInputString();
		obj1.reverseString();
	}

}
