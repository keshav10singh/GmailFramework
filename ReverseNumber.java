package quiz_question_java;

import java.util.Scanner;

/**
 * Reverse the number enter by user
 * @author keshav.singh
 *Number 3454 Reverse 4534
First loop
reverse=0
reverse=0+3454%10=4
number=3454/10=345

Scond Loop
reverse=4*10=40
reverse=40+345%10=40+5=45
number=345/10=34

Third Loop	
reverse=45*10=450
reverse450+34%10=450+3=453
number=34/10=4

Fourth
reverse=453*10=4530
number=4530+4%10=4530+4=4534
number=0
 */
public class ReverseNumber {
	
	public void reverseNumber() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number");
		int number=scn.nextInt();
		int reverse=0;
		while(number!=0) {
			reverse=reverse*10;
			reverse=reverse+number%10;
			number=number/10;
		}
		System.out.println("Reverse Number is:"+reverse);
	}
	public static void main(String[] args) {
		ReverseNumber obj=new ReverseNumber();
		obj.reverseNumber();
	}

}
