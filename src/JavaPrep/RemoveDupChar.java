package JavaPrep;

import java.util.HashSet;

public class RemoveDupChar {

	public static void main(String[] args) {

		String s = "viisshall";
		
		HashSet<Character> obj = new HashSet<>();
		for(int i =0;i<s.length();i++) {
			obj.add(s.charAt(i));	
		}
		System.out.println(obj);
	}

}
