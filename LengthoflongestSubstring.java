package quiz_question_java;

import java.util.HashMap;

public class LengthoflongestSubstring {
/**
 * Charcater between two repeated char Ia... mLe..a (that is 3)
 */
	String s1= "IamLearningJav";
	public static int lengthofLongestSubString(String s) {
		char[] charArray= s.toCharArray();
		int len=0;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<charArray.length;i++) {
			if(!map.containsKey(charArray[i])) {
				map.put(charArray[i], i );
				}
			else {
				len=Math.max(len, map.size());
				System.out.println(map);
				map.clear();
				
			}
		}
		System.out.println(map);
		return Math.max(len, map.size());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(lengthofLongestSubString("ABCDABCD"));
	}

}
