package JavaPrep;

import java.util.Arrays;

public class SwepStringinStringArray {

	public static void main(String[] args) {
		 String[] s = {"Vishal", "Sanu", "Om", "Prakash"};
	        String[] result = new String[s.length];

	        for (int i = 0; i < s.length; i++) {
	            if (s[i].equals("Om")) {
	                result[i] = "Prakash";
	            } else if (s[i].equals("Prakash")) {
	                result[i] = "Om";
	            } else {
	                result[i] = s[i];
	            }
	        }
	        // Print the updated array     
	        System.out.println(Arrays.toString(result));
	        
	        
	        System.out.println("*************************");
	        
	        int [] v = {1,2,3,4,5};
	        int[] result2 = new int [v.length];

	        for (int i = 0; i < v.length; i++) {
	            if (v[i]==5) {
	                result2[i] =1;
	            } else if (v[i]==1) {
	                result2[i] = 5;
	            } else {
	                result2[i] = v[i];
	            }
	        }
	        // Print the updated array     
	        System.out.println(Arrays.toString(result2));
	        
	        
	        
	        

	}

}
