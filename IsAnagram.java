package quiz_question_java;

public class IsAnagram {
	
	String s1="abc";
	String s2="bac";
	
	public boolean checkAnagram(String a1,String a2) {
		char[] chars = a1.toCharArray();
		StringBuilder seconda2=new StringBuilder(a2);
		for(Character ch:chars) {
			int index=seconda2.indexOf(""+ch);
			System.out.println(index);
			if(index!=-1) {
				seconda2.deleteCharAt(index);
			}
		}
		if(seconda2.length()==0) {
			return true;
		}
		else {
			return false;
		}
		
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsAnagram obj=new IsAnagram();
		boolean returndata=obj.checkAnagram("zabc", "cbaz");
		System.out.println(returndata);
	}

}
