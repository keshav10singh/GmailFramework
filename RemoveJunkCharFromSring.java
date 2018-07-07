package quiz_question_java;

import java.util.Scanner;

public class RemoveJunkCharFromSring {
/** using regular expression
 * 
 * @param args
 */ 
	
	public void removeJunkChar() {
		String junk="@#$%&*KeshavSingh";
		junk=junk.replaceAll("[^a-zA-z0-9]","");
		System.out.println(junk);
	}
	/**
	 * Remove user input junk character
	 */
	public void userInputJunk() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Junck String");
		String junk1=scn.next();
		junk1=junk1.replaceAll("[^a-zA-z0-9]","");
		System.out.println(junk1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveJunkCharFromSring obj=new RemoveJunkCharFromSring();
		obj.removeJunkChar();
		obj.userInputJunk();
	}

}
