package JavaPrep;

public class ReplacewithitPlace {

	public static void main(String[] args) {
		  String s = "Vishal";
	        String result = "";

	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            if (ch == 'l') {
	                result += 'V';
	            } else if (ch == 'V') {
	                result += 'l';
	            } else {
	                result += ch;
	            }
	        }

	        System.out.println("Updated String: " + result);
	        
	     
	        

	}

}
