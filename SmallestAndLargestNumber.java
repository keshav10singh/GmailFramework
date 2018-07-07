package quiz_question_java;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargestNumber {

	public void smallAndlarge() {
		int numbers[] = { 12, 15, 90, -1, 33, 89, 767, -20 };
		int largest = numbers[0];
		int smallest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Number list is :" + Arrays.toString(numbers));
		System.out.println("Largest number is:" + largest);
		System.out.println("Smallest number is:" + smallest);
	}

	public void userEntereslist() {
		int largest = 0;
		int smallest = 0;
		int num;
		System.out.println("Enter Number List");
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		num = input.nextInt();
		// char[] numbers1=name.toCharArray();

		smallest = num;
		for (int i = 2; i < n; i++) {
			if (num > largest) {
				largest = num;
			} else if (num < smallest) {
				smallest = num;
			}
		}
		System.out.println("Number list is :" + num);
		System.out.println("Largest number is:" + largest);
		System.out.println("Smallest number is:" + smallest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmallestAndLargestNumber obj = new SmallestAndLargestNumber();
		// obj.smallAndlarge();
		obj.userEntereslist();

	}

}
