package quiz_question_java;

public class MissingNumber {

	/**
	 * find out missing number from series {1,2,3,4..6,}
	 * sum=1+2+3+4+6=16
	 * sum1=1+2+3+4+5+6=21
	 * number=21-16=5
	 * @param args
	 */
	
	public void missingNumber(){
		int[] ar= {1,2,3,5,6};
		int sum=0;
		int sum1=0;
	
		for(int i=0;i<ar.length;i++) {
			 sum = sum+ar[i];
		}
		for(int j=1;j<=6;j++) {
			sum1=sum1+j;
			}
		System.out.println("First Sum is:"+sum);
		System.out.println("Second Sum is:"+sum1);
		
		System.out.println("Missing Number is:"+(sum1-sum));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumber obj1=new MissingNumber();
		obj1.missingNumber();
	}

}
