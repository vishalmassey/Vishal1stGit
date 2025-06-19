package JavaPrep;

public class PrintNonRepetChar {

	public static void main(String[] args) {
		String s= "vvisshahal";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			boolean unique = true;
			
			for(int j=0;j<s.length();j++) {
				if(i!=j && s.charAt(i)==s.charAt(j)) {
					unique=false;
				}
			}
			if(unique) {
				count++;
				if(count==1) {// if want 2nd non repetev then put count==2,for third put 3 
					System.out.println("1st non repetve chartr is "+ s.charAt(i));
				}
			
			}
		}
		

	}

}
