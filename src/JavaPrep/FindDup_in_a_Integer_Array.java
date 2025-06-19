package JavaPrep;

import java.util.HashSet;

public class FindDup_in_a_Integer_Array {

	public static void main(String[] args) {
				 String [] a = {"vishalmadshsdidddgdg"};
		
		 HashSet<Character> obj =new HashSet<>();
		 for(String b:a) {
			 for(int i=0;i<b.length();i++) {
				 obj.add(b.charAt(i));
			 }
			
		 for(Character ch:obj) {
			 int count=0;
			 for(int i=0;i<b.length();i++) {
				 if(ch==b.charAt(i)) {
					 count++;
				 }
			 }
			 System.out.println(ch+"  "+count);
		 }
		 
		 
		 
		 }
		 
		 
		 
		 


	}

}
