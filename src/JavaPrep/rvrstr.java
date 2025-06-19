package JavaPrep;

public class rvrstr {

	public static void main(String[] args) {
		String s="Vishal";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);

	}

}
