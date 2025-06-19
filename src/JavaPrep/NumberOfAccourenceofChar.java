package JavaPrep;

import java.util.*;

public class NumberOfAccourenceofChar {

	public static void main(String[] args) {
		String s= "Visshaal";
		
		HashSet<Character> obj = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			obj.add(s.charAt(i));
		}
		//System.out.println(obj);
		
		for(Character ch:obj) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch+"---->"+count);
			
		}
				
		

	}

}
