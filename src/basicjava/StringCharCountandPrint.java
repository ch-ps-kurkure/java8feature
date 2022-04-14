package basicjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringCharCountandPrint {

	public void duplicateString(String str) {
		if(str==null) {
			System.out.println("String null");
			return;
		}
		if(str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		if(str.length()==1) {
			System.out.println("Only One Char");
		}
		
		char word[]=str.toCharArray();
		Map<Character, Integer> mapdata= new HashMap<>();
		for(Character ch: word) {
			if(mapdata.containsKey(ch)) {
				mapdata.put(ch,mapdata.get(ch)+1);
			}
			else {
				mapdata.put(ch,1);
			}
			
		}//Print the Map
			
			Set<Map.Entry<Character,Integer>> entrySet=mapdata.entrySet();
			for(Map.Entry<Character, Integer> entry:entrySet) {
				if(entry.getValue()>1) {
					System.out.println(entry.getKey()+":"+entry.getValue());
				
			}
		}
	}
}
