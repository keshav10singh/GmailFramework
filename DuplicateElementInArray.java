package quiz_question_java;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[] = { "C", "Java", "Phython", "Ruby", "JavaScript", "Csharp", "Ruby", "C" };

		// Compare each element-Time complexcity O(n*n) [n square]----worst solution

		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equals(name[j])) {
					System.out.println("Duplicate Element is: " + name[i]);
				}
			}
		}

		// Using HashSet-It Stores only unique value---Time complexcity is O(n )
		Set<String> store = new HashSet<String>();
		for (String newname : name) {
			if (store.add(newname) == false)
				System.out.println("Duplicate Element using HashSet is:" + newname);
		}

		// using HashMap-Time ComplexityO(2n)
		Map<String, Integer> storemap = new HashMap<String, Integer>();
		for (String newname : name) {
			Integer count = storemap.get(newname);
			if (count == null) {
				storemap.put(newname, 1);
			} else {
				storemap.put(newname, ++count);
			}
		}
			//Get Values from HashMap Object
		Set<java.util.Map.Entry<String, Integer>> entryset=storemap.entrySet();
		for(java.util.Map.Entry<String, Integer> entry: entryset) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate Element using HashMap is "+ entry.getKey()); 
			}
			
		}
		
		
		
		
		
	}

}
