package JavaPrep;

public class ReverseString {

	public static void main(String[] args) {
		String s = "ABA";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		if(rev.equals(s)){
			System.out.println("Pelindrom");
		}else {
			System.out.println("Not pelindrome");
		}
	}

}
