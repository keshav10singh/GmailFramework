package quiz_question_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicareCharInString {

	 String st="I am Learning Java";
	public void findDuplicateCharInString(String st2) {
		Map<Character, Integer> charmap = new HashMap<Character,Integer>();
		char[] chars = st2.toCharArray();
		for(Character ch: chars) {
			if(charmap.containsKey(ch)) {
				charmap.put(ch, charmap.get(ch)+1);
			}else {
				charmap.put(ch,1);
			}
		}
			Set<Character> keys=charmap.keySet();
			for(Character ch : keys) {
				if(charmap.get(ch)>1){
					System.out.println(ch+"......."+charmap.get(ch));
				}
			}
			
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicareCharInString obj=new DuplicareCharInString();
		obj.findDuplicateCharInString(obj.st);
    
		
		
	}

}
